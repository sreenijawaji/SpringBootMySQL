package com.jsr.SpringBootMySQL.dependencyInjection;

import com.jsr.SpringBootMySQL.dependencyInjection.DepndencyInjectionEmployeeRepository;
import com.jsr.SpringBootMySQL.dependencyInjection.DepndencyInjectionEmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class DICreatingWaysExampleService {

    @Autowired
    DepndencyInjectionEmployeeRepository depndencyInjectionEmployeeRepository;

    //Ways of Creating Dependency Injection
    // using new keyword
    public static void main(String[] args) {
        //Way1 - Creating dependency injection
        DepndencyInjectionEmployeeRepositoryImpl depndencyInjectionEmployeeRepositoryImpl = new DepndencyInjectionEmployeeRepositoryImpl();

        //Way2 - Creating dependency injection - by creating object for interface impl - runtime polymorphism
        DepndencyInjectionEmployeeRepository depndencyInjectionEmployeeRepository = new DepndencyInjectionEmployeeRepositoryImpl();

        //Way3 -  by creating an instance in another class
        DepndencyInjectionEmployeeRepository depndencyInjectionEmployeeRepositoryWay3 = DependencyInjectionExampleInstanceFactory.getInstance();

        //Way4
        //@Autowired  -  using Autowired annotaion
    }


}

