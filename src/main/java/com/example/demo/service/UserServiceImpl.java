package com.example.demo.service;

import com.example.demo.model.UserDTO;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO registration(UserDTO user) {
        if (user.getName() == null)
            throw new RuntimeException("name is null");

        return userRepository.registration(user);
    }

    @Override
    public UserDTO login(String name) {
        return userRepository.login(name);
    }

}
