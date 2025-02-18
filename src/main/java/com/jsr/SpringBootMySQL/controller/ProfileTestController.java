package com.jsr.SpringBootMySQL.controller;

import com.jsr.SpringBootMySQL.beanScope.SessionScopeBeanTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileTestController {

    // Injecting the value of 'my.website.name'
    // property from configuration
    @Value("${my.website.name}")
    private String myWebsiteName;

    @Value("${my.prop}")
    private String environmentValue;

    // Handling GET requests at the root path ("/")
    // and returning a welcome message
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String welcome() {
        // Constructing and returning a welcome message
        // including the injected website name
        return "Welcome to " + myWebsiteName + "Environment" + environmentValue;
    }



}
