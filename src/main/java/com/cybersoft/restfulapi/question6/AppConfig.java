package com.cybersoft.restfulapi.question6;

import com.cybersoft.restfulapi.question6.service.GreetingServiceV2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public GreetingServiceV2 greetingServiceV2() {
        return new GreetingServiceV2();
    }
}
