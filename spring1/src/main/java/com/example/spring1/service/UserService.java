package com.example.spring1.service;

import com.example.spring1.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();
    Optional<User> getById(int id);
    void saveUser(User u);
    void deleteById(int id);
}
