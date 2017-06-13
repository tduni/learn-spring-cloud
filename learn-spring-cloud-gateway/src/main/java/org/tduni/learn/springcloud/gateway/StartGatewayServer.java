package org.tduni.learn.springcloud.gateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by kidal on 2017/6/13.
 *
 * @author kidal
 * @since 1.0.0
 */
@SpringCloudApplication
@EnableZuulProxy
public class StartGatewayServer {
    /**
     *
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(StartGatewayServer.class).web(true).run(args);
    }
}
