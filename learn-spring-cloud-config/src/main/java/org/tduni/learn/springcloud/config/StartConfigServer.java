package org.tduni.learn.springcloud.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by kidal on 2017/6/13.
 *
 * @author kidal
 * @since 1.0.0
 */
@SpringBootApplication
@EnableConfigServer
public class StartConfigServer {
    /**
     *
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(StartConfigServer.class).web(true).run(args);
    }
}
