package com.jsr.SpringBootMySQL.dependencyInjection;


public class DependencyInjectionExampleInstanceFactory {

    public static DepndencyInjectionEmployeeRepository getInstance(){
        return new DepndencyInjectionEmployeeRepositoryImpl();
    }
}

