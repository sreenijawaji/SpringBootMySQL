package com.jsr.SpringBootMySQL.respository;

import com.jsr.SpringBootMySQL.Entity.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeInfo, Integer> {


}
