package com.viet.le.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by VTL on 2/18/18.
 */
@RestController
@RequestMapping(path = "/")
public class DemoController {
    @RequestMapping(value = "demo/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable(value="name") String name) {
        return "Hello " + name;
    }
}
