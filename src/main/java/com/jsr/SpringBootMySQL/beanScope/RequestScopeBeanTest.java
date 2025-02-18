package com.jsr.SpringBootMySQL.beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component

@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestScopeBeanTest {

    //IOC conainter -  Bean scope and life cycle.
    //singleton
    //prototype
    //Request
    //Session
    //Application
    //WebSocket

    String message;


    public RequestScopeBeanTest(){
        System.out.println("RequestScopeBeanTest() instance created");
        this.message = "This is a request-scoped bean-------";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
