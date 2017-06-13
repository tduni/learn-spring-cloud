package org.tduni.learn.springcloud.feign.api;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.tduni.learn.springcloud.commons.contract.api.HelloServerApi;
import org.tduni.learn.springcloud.commons.contract.model.User;

/**
 * Created by kidal on 2017/6/13.
 *
 * @author kidal
 * @since 1.0.0
 */
@Component
public class HelloServerServiceFallback implements HelloServerApi {
    @Override
    public String hello() throws InterruptedException {
        return null;
    }

    @Override
    public String hello2(@RequestParam("name") String name) {
        return null;
    }

    @Override
    public User hello3(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return null;
    }

    @Override
    public String hello4(@RequestBody User user) {
        return null;
    }
}
