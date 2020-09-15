package com.bookcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajax")
public class HelloWorldAjaxController {
    @RequestMapping("/hello")
    public String say(){
        return "{'message1':'SpringBoot How are u','message2','hello Ajax'}";
    }
}
