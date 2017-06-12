package org.tduni.learn.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    private final RestTemplate restTemplate;

    /**
     *
     */
    @Autowired
    public HelloController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     *
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return restTemplate.getForEntity("http://HELLO-SERVER/hello", String.class).getBody();
    }
}
