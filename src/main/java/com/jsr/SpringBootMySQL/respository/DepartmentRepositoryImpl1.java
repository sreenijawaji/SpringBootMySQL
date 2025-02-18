package com.jsr.SpringBootMySQL.respository;

import org.springframework.stereotype.Component;

@Component
public class DepartmentRepositoryImpl1 implements DepartmentRepository{


    @Override
    public void saveDepartment() {
        System.out.println("implmenting DepartmentRepositoryImpl1 :: saveDepartment()  method");
    }
}

