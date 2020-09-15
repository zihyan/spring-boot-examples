package com.bookcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    @ResponseBody
    public String greeting(){
        System.out.println("Hello");
        return "greeting";
    }
    @GetMapping("/hi")
    public String hi(@RequestParam(value = "abcd", required = false, defaultValue = "World")String name0, Model model){
        model.addAttribute("name", name0);
        return "hi";
    }
}
