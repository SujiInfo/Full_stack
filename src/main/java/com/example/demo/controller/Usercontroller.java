package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.Userservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Usercontroller {

    private final Userservice userservice;

    public Usercontroller(Userservice userservice) {
        this.userservice = userservice;
    }

    // GET ALL USERS
    @GetMapping
    public List<User> getAllUsers() {
        return userservice.getAllUsers();
    }

    // SAVE USER
    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userservice.saveUser(user);
    }
}


