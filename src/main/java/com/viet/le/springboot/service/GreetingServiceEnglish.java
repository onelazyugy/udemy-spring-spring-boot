package com.viet.le.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by VTL on 2/18/18.
 */

@Component
@Profile("english")
public class GreetingServiceEnglish implements GreetingService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public void getUsers() {
        ResponseEntity<String> res = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", String.class);
        String body = res.getBody();
        System.out.println(body);
    }
}
