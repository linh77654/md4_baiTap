package com.example.validate.service;



import com.example.validate.model.Users;
import com.example.validate.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepository userRepository;

    @Override
    public List<Users> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Users findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Users student) {
        userRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
