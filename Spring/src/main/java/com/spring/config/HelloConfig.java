package com.spring.config;

import com.spring.services.HelloWorldFactory;
import com.spring.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory helloWorldFactory() {
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("english")
    @Primary
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory) {
        return factory.createHelloWorldService("en");
    }

    @Bean
    @Qualifier("spanish")
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory) {
        return factory.createHelloWorldService("es");
    }

    @Bean
    @Profile("french")
    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory factory) {
        return factory.createHelloWorldService("fr");
    }

    @Bean
    @Profile("german")
    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory) {
        return factory.createHelloWorldService("de");
    }

    @Bean
    @Profile("polish")
    public HelloWorldService helloWorldServicePolish(HelloWorldFactory factory) {
        return factory.createHelloWorldService("pl");
    }

    @Bean
    @Profile("russian")
    public HelloWorldService helloWorldServiceRussian(HelloWorldFactory factory) {
        return factory.createHelloWorldService("ru");
    }
}