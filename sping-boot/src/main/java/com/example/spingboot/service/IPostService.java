package com.example.spingboot.service;

import com.example.spingboot.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IPostService {
    Page<Post> findAll(Pageable pageable);

    void savePost(Post post);

    void deletePost(Long id);

    void updatePost(Post Post);

    Post findPostById(Long id);

    Page<Post> findByTitleContaining (String title, Pageable pageable);
}