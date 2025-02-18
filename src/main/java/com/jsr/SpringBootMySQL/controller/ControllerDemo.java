package com.jsr.SpringBootMySQL.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerDemo {


    //@Controller looks for model and view
    @GetMapping("/controller/hello")
    public String welcome(){
        return "hello";
    }

    @GetMapping(value = "/controller/message", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String message(){
        return "welcome to JSR technologies";
    }

}
