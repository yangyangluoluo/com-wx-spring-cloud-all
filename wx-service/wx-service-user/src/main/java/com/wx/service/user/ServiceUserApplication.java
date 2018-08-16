package com.wx.service.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/2
 * @time: 下午3:08
 * @description : 这是关于用户服务的模块，包括用户，权限，资源等数据
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
@ComponentScan(basePackages = { "com.wx.service.user.serviceimpl"})
@MapperScan(basePackages = {"com.wx.service.user.mapper"})
public class ServiceUserApplication {


     /**
     * lijianguo
     * 2018/8/6 - 上午11:10
     * 启动项
     */
    public static void main(String[] args) {

        // 程序启动以及个性化设置
        SpringApplication.run(ServiceUserApplication.class, args);
    }
}


