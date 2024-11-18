package com.example.spingboot.service;

import com.example.spingboot.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    Blog findById(Long id);
    void save(Blog student);
    void delete(Long id);
    List<Blog> searchByName( String searchName);
}