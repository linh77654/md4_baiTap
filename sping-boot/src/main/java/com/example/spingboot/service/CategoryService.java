package com.example.spingboot.service;

import com.example.spingboot.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Override
    public List<Category> findAll() {
        return List.of();
    }
}
