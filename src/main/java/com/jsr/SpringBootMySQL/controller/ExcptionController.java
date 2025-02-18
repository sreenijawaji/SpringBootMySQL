package com.jsr.SpringBootMySQL.controller;

import com.jsr.SpringBootMySQL.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("/exceptions")
public class ExcptionController {


//    @Autowired
//    RestTemplate restTemplate;


    @GetMapping("/getAllUsers")
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"Sreeni", "jawaji"));
        userList.add(new User(2,"Swetha", "jawaji"));
        userList.add(new User(3,"Sudhiksha", "jawaji"));
        userList.add(new User(2,"Jashwik", "jawaji"));
        return userList;
    }


//    @GetMapping("/getUsersRestTemplate")
//    public List<User> getUsersRestTemplate() {
//
//        return null;//restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", List.class);
//    }

    @GetMapping("/getUserbyName/{name}")
    public User getUsersbyUsername(@PathVariable String name) {
        System.out.println();
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"Sreeni", "jawaji"));
        userList.add(new User(2,"Swetha", "jawaji"));
        userList.add(new User(3,"Sudhiksha", "jawaji"));
        userList.add(new User(2,"Jashwik", "jawaji"));

        User user = userList.stream()
                .filter(x -> x.getUsername().equals(name))
                .findFirst()
                .orElse(null);
        return user;
    }




}
