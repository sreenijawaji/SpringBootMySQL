package com.jsr.SpringBootMySQL.config;

import com.jsr.SpringBootMySQL.pojo.User;
import com.jsr.SpringBootMySQL.service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //Example Creating Bean
    //@Bean
    //public EmployeeService employeeService(){
        //return  new EmployeeService();
    //}

    @Bean
    public User user(){
        User user = new User();
        user.setId(5);
        user.setUsername("sreeni");
        user.setPassword("sreeni5585");
        return user;
    }
}
