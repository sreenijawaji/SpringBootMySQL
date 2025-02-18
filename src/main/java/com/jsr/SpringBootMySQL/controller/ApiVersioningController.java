package com.jsr.SpringBootMySQL.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiVersioningController {

    @GetMapping("hello")
    public String getMessage(){
        return " Version1 Hello REST Controller";
    }

    @GetMapping("/v1/hello")
    public String getHelloVersion1(){
        return "Version1 Hello REST Controller";
    }

    @GetMapping("/v2/hello")
    public String getHelloVersion2(){
        return "Version2 Hello REST Controller";
    }

    @GetMapping("getHelloVersionNumber")
    public String getHelloVersion3(@RequestParam int versionNumber){
        if(versionNumber == 1) {
            return "Version1 Hello REST Controller";
        }else {
            return "Version2 Hello REST Controller";
        }
    }
}
