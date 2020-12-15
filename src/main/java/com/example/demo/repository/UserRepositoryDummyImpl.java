package com.example.demo.repository;

import com.example.demo.model.UserDTO;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserRepositoryDummyImpl implements UserRepository {

    private static int ids = 0;
    private Map<String, UserDTO> users = new HashMap<>();

    @Override
    public UserDTO registration(UserDTO user) {
        UserDTO savedUser = users.get(user.getName());
        if (savedUser != null) {
            return  savedUser;
        }

        user.setId(ids++);
        users.put(user.getName(), user);
        return user;
    }

    @Override
    public UserDTO login(String name) {
        return users.get(name);
    }

}
