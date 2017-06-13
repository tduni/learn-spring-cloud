package org.tduni.learn.springcloud.gateway.dynamic;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;

/**
 * Created by kidal on 2017/6/13.
 *
 * @author kidal
 * @since 1.0.0
 */
@SpringCloudApplication
@EnableZuulProxy
public class StartGatewayDynamicServer {
    /**
     *
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(StartGatewayDynamicServer.class).web(true).run(args);
    }

    /**
     *
     */
    @Bean
    @RefreshScope
    @ConfigurationProperties("zuul")
    public ZuulProperties zuulProperties() {
        return new ZuulProperties();
    }
}
