package com.jsr.SpringBootMySQL.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {

    @GetMapping("/restController/hello")
    public String getMessage(){
        return "Hello REST Controller";
    }

}
