package com.jsr.SpringBootMySQL.beanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") //Creates Instance only one time
public class SingletonBeanScope {

    //IOC conainter -  Bean scope and life cycle.
    //singleton
    //prototype
    //Request
    //Session
    //Application
    //WebSocket

    @Autowired
    PrototypeBeanScope prototypeBeanScope;

    public SingletonBeanScope(){
        System.out.println("SinlgetonBeanScope() instance created");
    }

    public PrototypeBeanScope getPrototypeBeanScope(){
        return prototypeBeanScope;
    }
}
