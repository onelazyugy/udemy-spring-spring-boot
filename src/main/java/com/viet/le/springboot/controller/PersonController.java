package com.viet.le.springboot.controller;

import com.viet.le.springboot.model.Person;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by VTL on 2/25/18.
 */
@RestController
@RequestMapping(path = "/person")
public class PersonController {

    @RequestMapping(path = "/{name}")
    public Person getPerson(@PathVariable(name = "name")String name) {
        Person person = new Person();
        person.setAge("32");
        person.setName(name);
        person.setGender("male");
        return person;
    }
}
