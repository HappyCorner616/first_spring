package com.example.demo.controller;

import com.example.demo.model.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/registration")
    public UserDTO registration(@RequestBody UserDTO userDTO) {
        return userService.registration(userDTO);
    }

    @PutMapping("/login/{name}")
    public UserDTO login(@PathVariable String name) {
        return userService.login(name);
    }

    /*@GetMapping("/user/{id}")
    public UserDTO login(@PathVariable int id) {
        return userService.login(name);
    }*/

}
