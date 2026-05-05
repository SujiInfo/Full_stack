package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.Userrepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice {

    private final Userrepository userRepository;

    public Userservice(Userrepository userRepository) {
        this.userRepository = userRepository;
    }

    // SAVE USER
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // GET ALL USERS
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
