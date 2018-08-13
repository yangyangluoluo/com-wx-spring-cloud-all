package com.wx.service.configuration;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/3
 * @time: 上午10:24
 * @description : 第一个数据库
 */

@Configuration
@MapperScan(basePackages = {"com.wx.service.user.mapper.*"}, sqlSessionFactoryRef = "sqlSessionFactoryDynamic")
public class MybatisDynamicConfig {

    @Autowired
    @Qualifier(value = "dynamicDataSource")
    private DataSource dynamic;

    @Autowired
    private Environment env;

    @Bean
    public SqlSessionFactory sqlSessionFactoryDynamic() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        // 使用第一个数据源
        factoryBean.setDataSource(dynamic);
        // 设置mapper 的路径
        ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
        Resource[] mapperLocations= resourceResolver.getResources(env.getProperty("mybatis.mapper-locations"));
        factoryBean.setMapperLocations(mapperLocations);

        Resource locationResource= resourceResolver.getResource(env.getProperty("mybatis.config-location"));
        factoryBean.setConfigLocation(locationResource);

        return factoryBean.getObject();
    }


    @Bean
    public SqlSessionTemplate sqlSessionTemplateFirst() throws Exception {
        // 使用上面配置的Factory
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryDynamic());
        return template;
    }


}
