package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/helloworld")
    public String getHello() {
        return "Hello, World!";
    }
    
    @GetMapping("/getByUsername")
    public String getByUsername(@RequestParam String username) {
        return userService.getUserByUsername(username).toString();
    }

    @PostMapping("/create")
    public UserModel createUser(@RequestBody UserModel user) {
        return userService.createUser(user);}
}
