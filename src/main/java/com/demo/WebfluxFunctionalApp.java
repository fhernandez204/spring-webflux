package com.demo;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
//import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
 
//@SpringBootApplication
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class WebfluxFunctionalApp {
 
    public static void main(String[] args) {
        SpringApplication.run(WebfluxFunctionalApp.class, args);
    }
}