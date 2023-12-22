package com.jsr.SpringBootH2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee/api")
public class EmployeeController {


    @Autowired
    private EmployeeService service;


    @GetMapping("/hello")
    public String sayHello(){
        return "Hi Welcome to JSR Technologies";
    }


    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee Employee) {
        return service.saveEmployee(Employee);
    }

    @PostMapping("/addEmployees")
    public List<Employee> addEmployees(@RequestBody List<Employee> Employees) {
        return service.saveEmployees(Employees);
    }

    @GetMapping("/Employees")
    public List<Employee> findAllEmployees() {
        return service.getEmployees();
    }

    @GetMapping("/EmployeeById/{id}")
    public Employee findEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @GetMapping("/Employee/{name}")
    public Employee findEmployeeByName(@PathVariable String name) {
        return service.getEmployeeByName(name);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee Employee) {
        return service.updateEmployee(Employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return service.deleteEmployee(id);
    }

}
