package com.example.spingboot.service;

import com.example.spingboot.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    Blog findById(Long id);
    void save(Blog student);
    void delete(Long id);
    List<Blog> searchByName( String searchName);


    Page<Blog> findBlogByTitleContaining(String searchName, Pageable pageable);
}