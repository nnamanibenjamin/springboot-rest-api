package com.nnamanibenjamin.spring_restful_services.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nnamanibenjamin.spring_restful_services.entity.User;
import com.nnamanibenjamin.spring_restful_services.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {
   private UserService userService;


   @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
       User savedUser = userService.createUser(user);
        return new ResponseEntity<>(userService.createUser(savedUser), HttpStatus.CREATED);
    }

    /**
     * Retrieves a user by their unique identifier from the user service and 
     * returns a ResponseEntity containing the user object and an HTTP status of OK.
     * 
     * @param userId The unique identifier of the user to retrieve.
     * @return A ResponseEntity containing the user object and an HTTP status of OK.
     */
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserByIdUser(@PathVariable Long userId) {
        // Retrieve the user by their unique identifier
        User user = userService.getUserByIdUser(userId);
        
        // Return a ResponseEntity containing the user object and an HTTP status of OK
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }
}
