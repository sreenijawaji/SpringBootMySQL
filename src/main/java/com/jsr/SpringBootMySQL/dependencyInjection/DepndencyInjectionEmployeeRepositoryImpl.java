package com.jsr.SpringBootMySQL.dependencyInjection;

import com.jsr.SpringBootMySQL.Entity.EmployeeEntity;
import com.jsr.SpringBootMySQL.dependencyInjection.DepndencyInjectionEmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepndencyInjectionEmployeeRepositoryImpl implements DepndencyInjectionEmployeeRepository {


    @Override
    public List<EmployeeEntity> findAllEmployees() {
        System.out.println("Getting All Employees information");
        return null;
    }
}
