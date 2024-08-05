package com.nnamanibenjamin.spring_restful_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nnamanibenjamin.spring_restful_services.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
