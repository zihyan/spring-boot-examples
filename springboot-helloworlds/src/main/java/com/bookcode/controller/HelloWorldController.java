package com.bookcode.controller;

import com.bookcode.properties.MySqlProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloWorldController {
    @Value("${hello}")
    String hello;
//    @Value("${userName}")
//    String userName;
//    @Value("${password}")
//    String password;
//    @Value("${dbUrl}")
//    String dbUrl;
//    @Value("${jdbcName}")
//    String sqlName;

    @Resource
    private MySqlProperties mySqlProperties;

    @RequestMapping("/hello")
    public String hello(){
        return hello;
    }
    @RequestMapping("/jdbcinfo")
    public String jdbcinfo(){
        return "userName:"+ mySqlProperties.getUserName() +"<br/>"
                +"userPassword:"+ mySqlProperties.getPassword() +"<br/>"
                +"url:"+ mySqlProperties.getDbUrl() +"<br/>"
                +"sqlName:"+mySqlProperties.getJdbcName()+"<br/>";
    }
}
