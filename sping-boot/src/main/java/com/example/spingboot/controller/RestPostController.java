package com.example.spingboot.controller;

import com.example.spingboot.dto.PostDto;
import com.example.spingboot.model.Post;
import com.example.spingboot.service.IPostService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
public class RestPostController {
    @Autowired
    private IPostService postService;

    @GetMapping("")
    public ResponseEntity<Page<Post>> getPosts(@RequestParam(required = false, defaultValue = "0") int page,
                                               @RequestParam(required = false, defaultValue = "20") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Post> postPage = postService.findAll(pageable);
        if (postPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(postPage, HttpStatus.OK);
        }
    }

    @PostMapping("")
    public ResponseEntity<?> createPost(@RequestBody PostDto postDto) {
        Post post = new Post();
        BeanUtils.copyProperties(postDto, post);
        postService.savePost(post);
        return new ResponseEntity<>("Đã thêm thành công", HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable long id) {
        Post post = postService.findPostById(id);
        if (post == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(post, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePost(@PathVariable long id) {
        Post post = postService.findPostById(id);
        if (post == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        postService.deletePost(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatePost(@PathVariable long id, @RequestBody Post updatePost) {
        Post post = postService.findPostById(id);
        if (post == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        updatePost.setId(id);
        postService.savePost(updatePost);
        return new ResponseEntity<>("Cập nhật thành công",HttpStatus.OK);
    }
}