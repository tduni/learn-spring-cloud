package org.tduni.learn.springcloud.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by kidal on 2017/6/13.
 *
 * @author kidal
 * @since 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrixDashboard
public class StartHystrixDashboardServer {
    /**
     *
     */
    public static void main(String[] args) {
        SpringApplication.run(StartHystrixDashboardServer.class, args);
    }
}
