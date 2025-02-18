package com.jsr.SpringBootMySQL.beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDateTime;

@Component

@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionScopeBeanTest {

    //IOC conainter -  Bean scope and life cycle.
    //singleton
    //prototype
    //Request
    //Session
    //Application
    //WebSocket

    String message;


    public SessionScopeBeanTest(){
        System.out.println("SessionScopeBeanTest() Construcotr called ---"+ LocalDateTime.now());
        this.message = "This is a SESSION SCOPE bean-------";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
