package com.wx.configure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/9
 * @time: 上午10:02
 * @description : 这是配置中心
 */
@SpringBootApplication
@EnableConfigServer
@EnableFeignClients
public class FigurationApplication {

    public static void main(String[] args){
        // 程序启动以及个性化设置
        SpringApplication.run(FigurationApplication.class, args);
    }
}
