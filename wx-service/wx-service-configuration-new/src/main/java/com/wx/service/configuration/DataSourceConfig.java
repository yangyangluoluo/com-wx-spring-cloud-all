package com.wx.service.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/3
 * @time: 上午10:11
 * @description : 数据源的配置
 */

@Configuration
public class DataSourceConfig {

    @Autowired
    private Environment env;


    /**
     * 动态数据源: 通过AOP在不同数据源之间动态切换
     * @return
     */
    @Primary
    @Bean(name = "dynamicDataSource")
    public DataSource dynamicDataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(firstDataSource());
        // 配置多数据源
        Map<Object, Object> dsMap = new HashMap<>();
        dsMap.put("firstDataSource", firstDataSource());
        dsMap.put("secondDataSource", secondDataSource());

        dynamicDataSource.setTargetDataSources(dsMap);
        return dynamicDataSource;
    }


    /**
     * destroy-method="close"的作用是当数据库连接不使用的时候,就把该连接重新放到数据池中,方便下次使用调用.
     * @return
     */
    @Bean(name = "firstDataSource")
    public DataSource firstDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        // 地址
        dataSource.setUrl(env.getProperty("jdbc.datasourceFirst.url"));
        // 用户名
        dataSource.setUsername(env.getProperty("jdbc.datasourceFirst.username"));
        // 密码
        dataSource.setPassword(env.getProperty("jdbc.datasourceFirst.password"));
        // 驱动
        dataSource.setDriverClassName(env.getProperty("jdbc.datasourceFirst.driver-class-name"));
        // 初始化时建立物理连接的个数
        dataSource.setInitialSize(2);
        // 最大连接池数量
        dataSource.setMaxActive(20);
        // 最小连接池数量
        dataSource.setMinIdle(0);
        // 获取连接时最大等待时间，单位毫秒。
        dataSource.setMaxWait(60000);
        // 用来检测连接是否有效的sql
        dataSource.setValidationQuery("SELECT 1");
        // 申请连接时执行validationQuery检测连接是否有效
        dataSource.setTestOnBorrow(false);
        // 建议配置为true，不影响性能，并且保证安全性。
        dataSource.setTestWhileIdle(true);
        // 是否缓存preparedStatement，也就是PSCache
        dataSource.setPoolPreparedStatements(false);
        // 数据库的名字
        dataSource.setName("主数据库--写数据库");

        return dataSource;
    }


    /**
     * 第二个数据库
     * @return
     */
    @Bean(name = "secondDataSource")
    public DataSource secondDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        // 地址
        dataSource.setUrl(env.getProperty("jdbc.datasourceSecond.url"));
        // 用户名
        dataSource.setUsername(env.getProperty("jdbc.datasourceSecond.username"));
        // 密码
        dataSource.setPassword(env.getProperty("jdbc.datasourceSecond.password"));
        // 驱动器
        dataSource.setDriverClassName(env.getProperty("jdbc.datasourceSecond.driver-class-name"));
        // 初始化时建立物理连接的个数
        dataSource.setInitialSize(2);
        // 最大连接池数量
        dataSource.setMaxActive(20);
        // 最小连接池数量
        dataSource.setMinIdle(0);
        // 获取连接时最大等待时间，单位毫秒。
        dataSource.setMaxWait(60000);
        // 用来检测连接是否有效的sql
        dataSource.setValidationQuery("SELECT 1");
        // 申请连接时执行validationQuery检测连接是否有效
        dataSource.setTestOnBorrow(false);
        // 建议配置为true，不影响性能，并且保证安全性。
        dataSource.setTestWhileIdle(true);
        // 是否缓存preparedStatement，也就是PSCache
        dataSource.setPoolPreparedStatements(false);
        // 数据库的名字
        dataSource.setName("从数据库--读数据库");

        return dataSource;
    }



    /**
     * 配置@Transactional注解事物
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dynamicDataSource());
    }


}
