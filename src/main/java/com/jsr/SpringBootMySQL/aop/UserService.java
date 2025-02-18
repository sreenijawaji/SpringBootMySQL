package com.jsr.SpringBootMySQL.aop;

import com.jsr.SpringBootMySQL.pojo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    //Transaction
    //logging
    //vallidation
    //auditing
    //notification
    public List<User> getUsers() {

        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"Sreeni", "jawaji"));
        userList.add(new User(2,"Swetha", "jawaji"));
        userList.add(new User(3,"Sudhiksha", "jawaji"));
        userList.add(new User(2,"Jashwik", "jawaji"));
        return userList;
    }

    public User getUsersById(int id) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"Sreeni", "jawaji"));
        userList.add(new User(2,"Swetha", "jawaji"));
        userList.add(new User(3,"Sudhiksha", "jawaji"));
        userList.add(new User(2,"Jashwik", "jawaji"));

        User user = userList.stream().filter(x->x.getId()==1).findFirst().orElse(null);

        return user;
    }

    public User saveUser(User user) {
        System.out.println("User Saved");

        return user;
    }


}
