package org.tduni.learn.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tduni.learn.springcloud.ribbon.service.HelloService;

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
    private final HelloService helloService;

    /**
     *
     */
    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    /**
     *
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return helloService.hello();
    }
}
