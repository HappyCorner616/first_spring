package com.example.demo.repository;

import com.example.demo.model.UserDTO;

public interface UserRepository {

    UserDTO registration(UserDTO user);

    UserDTO login(String name);

}
