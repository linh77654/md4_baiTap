package com.example.spingboot.service;

import com.example.spingboot.model.Blog;
import com.example.spingboot.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {

    @Autowired
    private IBlogRepository blogRepository;
    @Override
    public List<Blog> findAll() {
        return  blogRepository.findAll();
    }
    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }
    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }
    @Override
    public void delete(Long id) {
        blogRepository.deleteById(id);
    }
    @Override
    public List<Blog> searchByName(String searchName) {
        return blogRepository.searchByName("%" + searchName + "%");
    }

    @Override
    public Page<Blog> findBlogByTitleContaining(String searchName, Pageable pageable) {
        if (searchName == null || searchName.isEmpty()) {
            searchName = "";
        }
        String s = "%" + searchName + "%";
        return blogRepository.findBlogByTitleContaining(s, pageable);
    }
}