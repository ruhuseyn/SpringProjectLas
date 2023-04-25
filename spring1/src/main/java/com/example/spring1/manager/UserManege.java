package com.example.spring1.manager;

import com.example.spring1.entity.User;
import com.example.spring1.repository.UserRepository;
import com.example.spring1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserManege implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {

        return userRepository.findAll();
    }

    @Override
    public Optional<User> getById(int id) {

        return userRepository.findById(id);
    }

    @Override
    public void saveUser(User u) {
        userRepository.save(u);


    }

    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);

    }
}
