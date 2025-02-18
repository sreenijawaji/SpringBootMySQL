package com.jsr.SpringBootMySQL.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetterDIExampleService {

    DepndencyInjectionEmployeeRepository depndencyInjectionEmployeeRepository;

    //Setter DI - Dependency Injection
    @Autowired
    public void setDepndencyInjectionEmployeeRepository(DepndencyInjectionEmployeeRepository depndencyInjectionEmployeeRepository){
        this.depndencyInjectionEmployeeRepository = depndencyInjectionEmployeeRepository;
    }

    public void test(){
        depndencyInjectionEmployeeRepository.findAllEmployees();
    }



}

