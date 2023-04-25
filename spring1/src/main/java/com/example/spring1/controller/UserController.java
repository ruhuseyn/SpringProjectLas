package com.example.spring1.controller;

import com.example.spring1.entity.User;
import com.example.spring1.manager.UserManege;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserManege userManege;

    public UserController(UserManege userManege) {
        this.userManege = userManege;
    }
    @GetMapping("/users")
    public List<User> getAll(){
        return userManege.getAll();
    }
    @GetMapping("/users/{id}")
    public Optional<User> getById(@PathVariable int id){
        return userManege.getById(id);
    }
    @PostMapping("/users")
    public void saveUser(@RequestBody User user){
        userManege.saveUser(user);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        userManege.deleteById(id);
    }
}
