package com.nnamanibenjamin.spring_restful_services.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nnamanibenjamin.spring_restful_services.entity.Employee;
import com.nnamanibenjamin.spring_restful_services.service.EmployeeService;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
@RequestMapping("api/employees")
public class EmployeeController {
    private EmployeeService employeeService;


    @PostMapping
    public ResponseEntity<Employee> creatEmployee(@RequestBody Employee employee) {
      Employee saveEmployee =  employeeService.creatEmployee(employee);
      return new ResponseEntity<>(employeeService.creatEmployee(saveEmployee), HttpStatus.CREATED); 
    }
}