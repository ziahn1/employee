package com.employee.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeemanagement.entity.EmployeeEntity;
import com.employee.employeemanagement.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/create")
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.createEmployee(employeeEntity);
    }
    @GetMapping("/getEmployee/{id}")
    public EmployeeEntity getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }
}
