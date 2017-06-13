package org.tduni.learn.springcloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by kidal on 2017/6/13.
 *
 * @author kidal
 * @since 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class StartFeignServer {
    /**
     *
     */
    public static void main(String[] args) {
        SpringApplication.run(StartFeignServer.class, args);
    }
}
