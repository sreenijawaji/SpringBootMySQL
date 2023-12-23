package com.jsr.SpringBootMySQL.controller;

import com.jsr.SpringBootMySQL.Entity.EmployeeInfo;
import com.jsr.SpringBootMySQL.service.EmployeeService;
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
    public EmployeeInfo addEmployee(@RequestBody EmployeeInfo employeeInfo) {
        return service.saveEmployee(employeeInfo);
    }

    @PostMapping("/addEmployees")
    public List<EmployeeInfo> addEmployees(@RequestBody List<EmployeeInfo> employeeInfos) {
        return service.saveEmployees(employeeInfos);
    }

    @GetMapping("/Employees")
    public List<EmployeeInfo> findAllEmployees() {
        return service.getEmployees();
    }

    @GetMapping("/EmployeeById/{id}")
    public EmployeeInfo findEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @GetMapping("/EmployeeInfo/{name}")
    public EmployeeInfo findEmployeeByName(@PathVariable String name) {
        return service.getEmployeeByName(name);
    }

    @PutMapping("/update")
    public EmployeeInfo updateEmployee(@RequestBody EmployeeInfo EmployeeInfo) {
        return service.updateEmployee(EmployeeInfo);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return service.deleteEmployee(id);
    }

}
