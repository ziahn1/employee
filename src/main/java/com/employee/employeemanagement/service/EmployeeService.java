package com.employee.employeemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import com.employee.employeemanagement.entity.EmployeeEntity;
import com.employee.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
       
    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity){
        return employeeRepository.save(employeeEntity);
    }
    public EmployeeEntity getEmployeeById(Long id){
       return employeeRepository.findById(id).get();
    }
}
