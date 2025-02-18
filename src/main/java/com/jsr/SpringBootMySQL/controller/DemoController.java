package com.jsr.SpringBootMySQL.controller;

import com.jsr.SpringBootMySQL.Entity.EmployeeEntity;
import com.jsr.SpringBootMySQL.beanScope.RequestScopeBeanTest;
import com.jsr.SpringBootMySQL.beanScope.SessionScopeBeanTest;
import com.jsr.SpringBootMySQL.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {


//    @Autowired
//    private RequestScopeBeanTest requestScopeBeanTest;

    @Autowired
    private SessionScopeBeanTest sessionScopeBeanTest;

    @GetMapping("/message")
    public String getMessage(){
        return sessionScopeBeanTest.getMessage();
    }

}
