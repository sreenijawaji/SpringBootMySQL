package com.jsr.SpringBootMySQL.controller;

import com.jsr.SpringBootMySQL.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


//    @Autowired
//    RestTemplate restTemplate;


    @GetMapping("/getUsers")
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"Sreeni", "jawaji"));
        userList.add(new User(2,"Swetha", "jawaji"));
        userList.add(new User(3,"Sudhiksha", "jawaji"));
        userList.add(new User(2,"Jashwik", "jawaji"));
        return userList;
    }


    @GetMapping("/getUsersRestTemplate")
    public List<User> getUsersRestTemplate() {

        return null;//restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", List.class);
    }




}
