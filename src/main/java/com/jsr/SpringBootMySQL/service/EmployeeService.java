package com.jsr.SpringBootMySQL.service;

import com.jsr.SpringBootMySQL.Entity.EmployeeEntity;
import com.jsr.SpringBootMySQL.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return repository.save(employeeEntity);
    }

    public List<EmployeeEntity> saveEmployees(List<EmployeeEntity> employeeEntitys) {
        return null;
    }

    public List<EmployeeEntity> getEmployees() {
        return repository.findAll();
    }

    public EmployeeEntity getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    public EmployeeEntity getEmployeeByName(String name) {
        return null;//repository.findByFirstName(name);
    }

    public String deleteEmployee(int id) {
        repository.deleteById(id);
        return "EmployeeEntity removed !! " + id;
    }

    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        EmployeeEntity existingEmployeeEntity = repository.findById(employeeEntity.getId()).orElse(null);
        existingEmployeeEntity.setFirstName(employeeEntity.getFirstName());
        existingEmployeeEntity.setSalary(employeeEntity.getSalary());
        return repository.save(existingEmployeeEntity);
    }

    public EmployeeEntity patchEmployee(EmployeeEntity employeeEntity) {
        EmployeeEntity existingEmployeeEntity = repository.findById(employeeEntity.getId()).orElse(null);
        existingEmployeeEntity.setFirstName(employeeEntity.getFirstName());
        existingEmployeeEntity.setSalary(employeeEntity.getSalary());
        return repository.save(existingEmployeeEntity) ;
    }
}

