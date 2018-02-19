package com.viet.le.springboot.service;

import org.springframework.stereotype.Component;

/**
 * Created by VTL on 2/18/18.
 */
@Component
public interface GreetingService {
    String sayHello(String name);
}
