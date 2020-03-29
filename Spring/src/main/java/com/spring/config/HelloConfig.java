package com.spring.config;


import com.spring.services.HelloWorldService;
import com.spring.services.HelloWorldServiceEnglishImpl;
import com.spring.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//Configuration is a form of Component
@Configuration
public class HelloConfig {

  
    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(){
      return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(){
       return new HelloWorldServiceSpanishImpl();
    }
}
