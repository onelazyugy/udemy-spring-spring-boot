package com.viet.le.springboot.controller;

import com.viet.le.springboot.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by VTL on 2/24/18.
 */
@RestController
@RequestMapping(path = "/api/")
public class DemoRestTemplateController {
    //--INJECTION METHOD 1
    @Autowired
    private GreetingService greetingService;
    //--END INJECTION METHOD 1

    //--INJECTION METHOD 2
//    private GreetingService greetingService;
//
//    @Autowired
//    public void setGreetingService(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
    //--END SETTER INJECTION METHOD 2

    @RequestMapping(path = "/users")
    public void getUsers() {
        this.greetingService.getUsers();
    }

}
