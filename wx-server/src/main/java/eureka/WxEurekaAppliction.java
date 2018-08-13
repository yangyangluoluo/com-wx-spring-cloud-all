package eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/2
 * @time: 上午11:23
 * @description : 服务注册中心所有的服务注册在这里
 */
@SpringBootApplication
@EnableEurekaServer
public class WxEurekaAppliction {

    public static void main(String[] args) {

        SpringApplication.run(WxEurekaAppliction.class, args);
    }
}
