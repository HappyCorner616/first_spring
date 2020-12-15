package com.example.demo.service;

import com.example.demo.model.UserDTO;

public interface UserService {

    UserDTO registration(UserDTO user);

    UserDTO login(String name);

}
