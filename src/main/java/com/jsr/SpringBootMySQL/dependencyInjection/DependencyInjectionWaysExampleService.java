package com.jsr.SpringBootMySQL.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DependencyInjectionWaysExampleService {

    //Field level DI - Dependency Injection
    @Autowired
    DepndencyInjectionEmployeeRepository depndencyInjectionEmployeeRepository;

    //Setter DI - Dependency Injection
    @Autowired
    public void setDepndencyInjectionEmployeeRepository(DepndencyInjectionEmployeeRepository depndencyInjectionEmployeeRepository){
        this.depndencyInjectionEmployeeRepository = depndencyInjectionEmployeeRepository;
    }

    //Constructor DI
    public DependencyInjectionWaysExampleService(DepndencyInjectionEmployeeRepository depndencyInjectionEmployeeRepository){
        this.depndencyInjectionEmployeeRepository = depndencyInjectionEmployeeRepository;
    }

}

