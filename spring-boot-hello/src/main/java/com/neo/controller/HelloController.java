package com.neo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${user.name}")
        private  String name;
    @Value("${user.age}")
        private String age;


	
    @RequestMapping("/")
    public String showUserInfo() {
        return "user.name:" + name + "<br/>"
                +"user.age:" + age + "<br/>";
    }
}