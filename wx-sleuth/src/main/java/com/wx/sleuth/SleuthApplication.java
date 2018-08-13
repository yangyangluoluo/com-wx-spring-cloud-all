package com.wx.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/9
 * @time: 下午2:11
 * @description : 分布式服务跟踪系统
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.wx.sleuth"})
@RestController
@EnableFeignClients
public class SleuthApplication {

    public static void main(String[] args){
        // 程序启动以及个性化设置
        SpringApplication.run(SleuthApplication.class, args);
    }

    @RequestMapping(value = "/tt", method = RequestMethod.GET)
    public String getUserDetail(Long userId) {

        String key = "AA";
        String value = "BB";

        return key;
    }
}
