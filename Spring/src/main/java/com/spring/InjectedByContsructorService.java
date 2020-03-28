package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 10/21/15.
 */
@Component
public class InjectedByContsructorService {
    private HelloWorldService helloWorldService;

    @Autowired
    public InjectedByContsructorService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void getMessage(){
        helloWorldService.sayHello();
    }
}
