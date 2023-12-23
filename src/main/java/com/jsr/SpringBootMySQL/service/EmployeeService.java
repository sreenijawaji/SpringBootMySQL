package com.jsr.SpringBootMySQL.service;

import com.jsr.SpringBootMySQL.Entity.EmployeeInfo;
import com.jsr.SpringBootMySQL.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public EmployeeInfo saveEmployee(EmployeeInfo employeeInfo) {
        return repository.save(employeeInfo);
    }

    public List<EmployeeInfo> saveEmployees(List<EmployeeInfo> employeeInfos) {
        return null;
    }

    public List<EmployeeInfo> getEmployees() {
        return repository.findAll();
    }

    public EmployeeInfo getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    public EmployeeInfo getEmployeeByName(String name) {
        return null;//repository.findByFirstName(name);
    }

    public String deleteEmployee(int id) {
        repository.deleteById(id);
        return "EmployeeInfo removed !! " + id;
    }

    public EmployeeInfo updateEmployee(EmployeeInfo employeeInfo) {
        EmployeeInfo existingEmployeeInfo = repository.findById(employeeInfo.getId()).orElse(null);
        existingEmployeeInfo.setFirstName(employeeInfo.getFirstName());
        existingEmployeeInfo.setSalary(employeeInfo.getSalary());
        return repository.save(existingEmployeeInfo);
    }
}

