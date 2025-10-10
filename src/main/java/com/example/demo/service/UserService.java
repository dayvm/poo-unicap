package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserModel createUser(UserModel user) {
        return userRepository.save(user);
    }

    public UserModel getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}