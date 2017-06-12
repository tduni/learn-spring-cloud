package org.tduni.learn.springcloud.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kidal on 2017/6/12.
 *
 * @author kidal
 * @since 1.0.0
 */
@RestController
public class HelloController {
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
    @RequestMapping("/hello")
    public String index() {
        //
        counterService.increment("learn.hello.count");

        //
        return "Hello World";
    }
}
