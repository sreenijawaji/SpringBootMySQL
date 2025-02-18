package com.jsr.SpringBootMySQL.dependencyInjection;

import com.jsr.SpringBootMySQL.Entity.EmployeeEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepndencyInjectionEmployeeRepository{

    List<EmployeeEntity> findAllEmployees();


}
