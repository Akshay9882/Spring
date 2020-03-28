package com.spring.controllers;

import com.spring.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//Controller is a form of component
@Controller
public class GreetingController {
    private HelloWorldService helloWorldService;
    //Autowired is managed at runtime using active profiles as there are two classes implementing HelloWorldService
    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello() {
        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
        return greeting;
    }
}
