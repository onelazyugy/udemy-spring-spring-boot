package com.viet.le.springboot.controller;

import com.viet.le.springboot.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by VTL on 2/18/18.
 */
@RestController
@RequestMapping(path="/")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping(path="hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable(value="name") String name) {
        return greetingService.sayHello(name);
    }
}
