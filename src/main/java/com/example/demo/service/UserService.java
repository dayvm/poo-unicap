package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserRequestDTO;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserModel createUser(UserRequestDTO user) {
        UserModel userModel = new UserModel();
        userModel.setPassword(user.getPassword());
        userModel.setUsername(user.getUsername());

        return userModel;
    }

    public UserModel getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}