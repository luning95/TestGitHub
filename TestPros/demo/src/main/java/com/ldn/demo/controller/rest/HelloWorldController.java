package com.ldn.demo.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public Object sayHello(String inname) {
        return "hello," + inname + "!";
    }

}
