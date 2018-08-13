package com.wx.controller.authority;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/6
 * @time: 下午2:13
 * @description : 权限的控制器的模块，这里主要是用来做权限的控制，即权限缓存，资源，角色之类
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableFeignClients
@ComponentScan(basePackages = {"com.wx.controller.authority.service.user",
                                "com.wx.controller.authority","com.wx.cache.redis"})
public class ConAuthorityApplication {

    public static void main(String[] args){
        // 程序启动以及个性化设置
        SpringApplication.run(ConAuthorityApplication.class, args);
    }
}
