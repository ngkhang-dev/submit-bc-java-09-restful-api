package com.cybersoft.restfulapi.question2.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
