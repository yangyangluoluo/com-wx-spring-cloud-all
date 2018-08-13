package com.wx.gateway.admin.fliter;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/8
 * @time: 上午10:19
 * @description : com-wx-spring-cloud-all描述
 */
@Configuration
public class RequestRateLimiterConfig {

    @Bean
    public KeyResolver addressKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
    }
}
