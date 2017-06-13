package org.tduni.learn.springcloud.hello2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.*;
import org.tduni.learn.springcloud.commons.contract.api.HelloServerApi;
import org.tduni.learn.springcloud.commons.contract.model.User;

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
    private final CounterService counterService;

    /**
     *
     */
    @Autowired
    public HelloController(CounterService counterService) {
        this.counterService = counterService;
    }

    /**
     *
     */
    @Override
    @RequestMapping("/hello")
    public String hello() {
        //
        counterService.increment("learn.hello.count");

        //
        return "Hello2 World";
    }


    /**
     *
     */
    @Override
    @RequestMapping("/hello2")
    public String hello2(@RequestParam String name) {
        return "Hello2 " + name;
    }

    /**
     *
     */
    @Override
    @RequestMapping("/hello3")
    public User hello3(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User(name + "2", age);
    }

    /**
     *
     */
    @Override
    @RequestMapping("/hello4")
    public String hello4(@RequestBody User user) {
        return "Hello2 " + user.getName() + ", " + user.getAge();
    }
}
