package com.jsr.SpringBootMySQL.aop;

import com.jsr.SpringBootMySQL.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Aspect
@Component
@Slf4j
public class LoggingAdvice {

    @Pointcut("*com.javatechie.service.ProductService")
    public void logPointCut(){

    }

    @After("*com.javatechie.service.ProductService")
    public void logRequest(){

    }

    @After("*com.javatechie.service.ProductService")
    public void logResponse(){

    }

    @AfterThrowing("*com.javatechie.service.ProductService")
    public void logError(){

    }
    
}
