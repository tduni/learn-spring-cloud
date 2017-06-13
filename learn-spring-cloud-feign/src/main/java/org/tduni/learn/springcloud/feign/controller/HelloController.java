package org.tduni.learn.springcloud.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tduni.learn.springcloud.commons.contract.api.HelloServerApi;
import org.tduni.learn.springcloud.commons.contract.model.User;

/**
 * Created by kidal on 2017/6/13.
 *
 * @author kidal
 * @since 1.0.0
 */
@RestController
public class HelloController {
    /**
     *
     */
    private final HelloServerApi api;

    /**
     *
     */
    @Autowired
    public HelloController(HelloServerApi api) {
        this.api = api;
    }

    /**
     *
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() throws InterruptedException {
        return api.hello();
    }

    /**
     *
     */
    @RequestMapping(value = "/v2/hello", method = RequestMethod.GET)
    public String v2_hello() throws InterruptedException {
        return api.hello() + '\n' +
                api.hello2("Kidal") + '\n' +
                api.hello3("Kidal", 27) + '\n' +
                api.hello4(new User("Kidal", 27)) + '\n';
    }
}
