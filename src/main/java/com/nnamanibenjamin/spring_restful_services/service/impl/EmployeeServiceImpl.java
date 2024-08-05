package com.nnamanibenjamin.spring_restful_services.service.impl;

import org.springframework.stereotype.Service;

import com.nnamanibenjamin.spring_restful_services.entity.Employee;
import com.nnamanibenjamin.spring_restful_services.repository.EmployeeRepository;
import com.nnamanibenjamin.spring_restful_services.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Override
    public Employee creatEmployee(Employee employee) {
       employeeRepository.save(employee);  
       return employee;
    }
    
}
