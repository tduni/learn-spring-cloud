package org.tduni.learn.springcloud.commons.contract.api;

import org.springframework.web.bind.annotation.*;
import org.tduni.learn.springcloud.commons.contract.model.User;

/**
 * Created by kidal on 2017/6/13.
 *
 * @author kidal
 * @since 1.0.0
 */
@RequestMapping
public interface HelloServerApi {
    /**
     *
     */
    @RequestMapping("/hello")
    String hello() throws InterruptedException;

    /**
     *
     */
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    String hello2(@RequestParam("name") String name);

    /**
     *
     */
    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
    User hello3(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    /**
     *
     */
    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    String hello4(@RequestBody User user);
}
