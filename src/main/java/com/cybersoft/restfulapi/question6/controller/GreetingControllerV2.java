package com.cybersoft.restfulapi.question6.controller;

import com.cybersoft.restfulapi.question6.service.GreetingServiceV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet-v2")
public class GreetingControllerV2 {

    private final GreetingServiceV2 greetingServiceV2;

    public GreetingControllerV2(GreetingServiceV2 greetingServiceV2) {
        this.greetingServiceV2 = greetingServiceV2;
    }

    @GetMapping
    public String greeting() {
        return greetingServiceV2.sayHello("Nguyen Khang");
    }
}
