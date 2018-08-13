package com.wx.service.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/2
 * @time: 下午4:24
 * @description : 这个系统的描述整个系统的参数和设计
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
public class ServiceSystemApplication {

    public static void main(String[] args){
        // 程序启动以及个性化设置
        SpringApplication.run(ServiceSystemApplication.class, args);
    }
}
