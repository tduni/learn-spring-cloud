package org.tduni.learn.springcloud.hello.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tduni.learn.springcloud.commons.contract.api.HelloServerApi;
import org.tduni.learn.springcloud.commons.contract.model.User;

import java.util.Random;

/**
 * Created by kidal on 2017/6/12.
 *
 * @author kidal
 * @since 1.0.0
 */
@RestController
public class HelloController implements HelloServerApi {
    /**
     *
     */
    private static final Logger logger = Logger.getLogger(HelloController.class);

    /**
     *
     */
    private final DiscoveryClient client;

    /**
     *
     */
    @Autowired
    public HelloController(DiscoveryClient client) {
        this.client = client;
    }

    /**
     *
     */
    @Override
    @RequestMapping("/hello")
    public String hello() throws InterruptedException {
        ServiceInstance instance = client.getLocalServiceInstance();
        int time = new Random().nextInt(3000);
        logger.info("Sleep " + time);
        Thread.sleep(time);
        return "Hello World";
    }

    /**
     *
     */
    @Override
    @RequestMapping("/hello2")
    public String hello2(String name) {
        return "Hello " + name;
    }

    /**
     *
     */
    @Override
    @RequestMapping("/hello3")
    public User hello3(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User(name, age);
    }

    /**
     *
     */
    @Override
    @RequestMapping("/hello4")
    public String hello4(@RequestBody User user) {
        return "Hello " + user.getName() + ", " + user.getAge();
    }
}
