package org.tduni.learn.springcloud.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by kidal on 2017/6/12.
 *
 * @author kidal
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class StartEurekaServer {
    /**
     *
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(StartEurekaServer.class).web(true).run(args);
    }
}
