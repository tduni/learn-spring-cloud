package org.tduni.learn.springcloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

/**
 * Created by kidal on 2017/6/12.
 *
 * @author kidal
 * @since 1.0.0
 */
@Service
public class HelloService {
    /**
     *
     */
    private final RestTemplate restTemplate;

    /**
     *
     */
    @Autowired
    public HelloService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     *
     */
    @HystrixCommand(fallbackMethod = "onHelloFallback")
    public String hello() {
        return restTemplate.getForEntity("http://HELLO-SERVER/hello", String.class).getBody();
    }

    /**
     *
     */
    @HystrixCommand(fallbackMethod = "onHelloFallback")
    public Future<String> asyncHello() {
        return new AsyncResult<String>() {
            @Override
            public String invoke() {
                return restTemplate.getForEntity("http://HELLO-SERVER/hello", String.class).getBody();
            }
        };
    }

    /**
     *
     */
    public String onHelloFallback() {
        return "onHelloFallback";
    }
}
