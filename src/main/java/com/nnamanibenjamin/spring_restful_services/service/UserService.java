package com.nnamanibenjamin.spring_restful_services.service;

import java.util.List;

import com.nnamanibenjamin.spring_restful_services.entity.User;

public interface UserService {

    User createUser(User user);
    User getUserByIdUser(Long userId);
    List<User> getAllUsers();
}
