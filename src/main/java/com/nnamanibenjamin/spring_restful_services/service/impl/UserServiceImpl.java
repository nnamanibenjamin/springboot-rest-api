package com.nnamanibenjamin.spring_restful_services.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nnamanibenjamin.spring_restful_services.entity.User;
import com.nnamanibenjamin.spring_restful_services.repository.UserRepository;
import com.nnamanibenjamin.spring_restful_services.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

   private UserRepository userRepository;
    @Override
    public User createUser(User user) {
        
        return userRepository.save(user);
    }
    @Override
    public User getUserByIdUser(Long userId) {
       Optional<User>optionalUser = userRepository.findById(userId);
       return optionalUser.get();
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
