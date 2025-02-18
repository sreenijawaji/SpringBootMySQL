package com.jsr.SpringBootMySQL.controller;

import com.jsr.SpringBootMySQL.Entity.EmployeeEntity;
import com.jsr.SpringBootMySQL.pojo.User;
import com.jsr.SpringBootMySQL.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class ContentNegotiationController {


    @GetMapping(produces = {"application/json", "application/xml"})
    public List<User> findAllEmployees() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"Sreeni", "jawaji"));
        userList.add(new User(2,"Swetha", "jawaji"));
        userList.add(new User(3,"Sudhiksah", "jawaji"));
        userList.add(new User(2,"Jashwik", "jawaji"));
        return userList;
    }






}
