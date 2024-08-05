package com.nnamanibenjamin.spring_restful_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nnamanibenjamin.spring_restful_services.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
