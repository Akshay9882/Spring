package com.spring.controllers;

import com.spring.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServiceSpanish;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Autowired
    @Qualifier("spanish")
    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceSpanish) {
        this.helloWorldServiceSpanish = helloWorldServiceSpanish;
    }

    public String sayHello() {
        String greeting = helloWorldService.getGreeting();
        System.out.println(helloWorldServiceSpanish.getGreeting());
        System.out.println(greeting);
        return greeting;
    }
}
