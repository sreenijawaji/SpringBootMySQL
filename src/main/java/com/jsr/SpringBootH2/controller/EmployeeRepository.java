package com.jsr.SpringBootH2.controller;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    Employee findByName(String name);

    @Override
    List<Employee> findAll();
}

