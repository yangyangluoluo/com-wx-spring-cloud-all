package com.wx.infrastruct.hystrix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/10
 * @time: 下午5:05
 * @description : com-wx-spring-cloud-all描述
 */
public class RemoteHystrix {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${spring.application.name}")
    private String applicationName;

    protected Object handHystrix(String methodName){
        logger.error("=======================服务熔断==========================================");
        throw new RuntimeException(applicationName+":"+ methodName);
    }
}
