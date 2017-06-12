package org.tduni.learn.springcloud.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by kidal on 2017/6/12.
 *
 * @author kidal
 * @since 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StartHelloServer {
    /**
     *
     */
    public static void main(String[] args) {
        SpringApplication.run(StartHelloServer.class, args);
    }
}
