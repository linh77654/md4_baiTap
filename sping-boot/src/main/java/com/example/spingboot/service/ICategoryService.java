package com.example.spingboot.service;

import com.example.spingboot.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
}
