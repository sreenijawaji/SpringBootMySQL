package com.jsr.SpringBootMySQL.controller;

import com.jsr.SpringBootMySQL.Entity.EmployeeEntity;
import com.jsr.SpringBootMySQL.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {


    @Autowired
    private EmployeeService service;


    @GetMapping("/hello")
    public String sayHello(){
        return "Hi Welcome to JSR Technologies";
    }


    @PostMapping("/addEmployee")
    public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return service.saveEmployee(employeeEntity);
    }

    @PostMapping("/addEmployees")
    public List<EmployeeEntity> addEmployees(@RequestBody List<EmployeeEntity> employeeEntitys) {
        return service.saveEmployees(employeeEntitys);
    }

    @GetMapping("/Employees")
    public List<EmployeeEntity> findAllEmployees() {
        return service.getEmployees();
    }

    @GetMapping("/EmployeesByRequestBody")
    public List<EmployeeEntity> getAllEmployees(@RequestBody EmployeeEntity employeeEntity) {

        return service.getEmployees();
    }

    @GetMapping("/EmployeeById/{id}")
    public EmployeeEntity findEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @GetMapping("/EmployeeEntity/{name}")
    public EmployeeEntity findEmployeeByName(@PathVariable String name) {
        return service.getEmployeeByName(name);
    }

    @PutMapping("/update")
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity EmployeeEntity) {
        return service.updateEmployee(EmployeeEntity);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return service.deleteEmployee(id);
    }

    @PatchMapping("/patch")
    public EmployeeEntity patchEmployee(@RequestBody EmployeeEntity EmployeeEntity) {
        return service.patchEmployee(EmployeeEntity);
    }



}
