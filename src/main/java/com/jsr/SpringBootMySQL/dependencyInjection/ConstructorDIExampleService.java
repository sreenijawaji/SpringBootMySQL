package com.jsr.SpringBootMySQL.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstructorDIExampleService {

    DepndencyInjectionEmployeeRepository depndencyInjectionEmployeeRepository;

    //Constructor DI
    //Mandatory dependency injection
    @Autowired
    public ConstructorDIExampleService(DepndencyInjectionEmployeeRepository depndencyInjectionEmployeeRepository){
        this.depndencyInjectionEmployeeRepository = depndencyInjectionEmployeeRepository;
    }

    public void test(){
        depndencyInjectionEmployeeRepository.findAllEmployees();
    }

}

