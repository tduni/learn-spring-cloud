package org.tduni.learn.springcloud.hello.controller;

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
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
