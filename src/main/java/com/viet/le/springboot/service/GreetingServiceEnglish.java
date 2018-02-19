package com.viet.le.springboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by VTL on 2/18/18.
 */

@Component
@Profile("english")
public class GreetingServiceEnglish implements GreetingService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
