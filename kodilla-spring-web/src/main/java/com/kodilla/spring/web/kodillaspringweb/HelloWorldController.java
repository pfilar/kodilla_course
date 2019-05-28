package com.kodilla.spring.web.kodillaspringweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/sayHello")
    public String helloWorld() {
        return "index";
    }
}
