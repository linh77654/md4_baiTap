package com.example.spingboot.service;

import jdk.jfr.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    void save(Category category);

    void deleteById(Long id);

    Category findById(Long id);

    void update(Category category);
}