package com.example.validate.service;

import com.example.validate.model.Users;

import java.util.List;

public interface IUserService {
    List<Users> findAll();
    Users findById(Long id);
    void save(Users student);
    void delete(Long id);
}