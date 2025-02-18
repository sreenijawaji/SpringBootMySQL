package com.jsr.SpringBootMySQL.respository;

import org.springframework.stereotype.Component;

@Component
public class DepartmentRepositoryImpl2 implements DepartmentRepository{


    @Override
    public void saveDepartment() {
        System.out.println("implmenting DepartmentRepositoryImpl2 :: saveDepartment()  method");
    }
}

