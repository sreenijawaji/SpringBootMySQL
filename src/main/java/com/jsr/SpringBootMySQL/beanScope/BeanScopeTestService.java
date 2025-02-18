package com.jsr.SpringBootMySQL.beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") //Creates Instance only one time
@Scope("prototype") // Creates instances as many times as you request to create
public class BeanScopeTestService {

    //IOC conainter -  Bean scope and life cycle.
    //singleton
    //prototype
    //Request
    //Session
    //Application
    //WebSocket

    public BeanScopeTestService(){
        System.out.println("BeanScopeTestService() instance created");
    }


}
