package com.jsr.SpringBootMySQL.beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBeanScope {

    //IOC conainter -  Bean scope and life cycle.
    //singleton
    //prototype
    //Request
    //Session
    //Application
    //WebSocket

    public PrototypeBeanScope(){
        System.out.println("PrototypeBeanScope() instance created");
    }


}
