package com.example.spingboot.repository;

import com.example.spingboot.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Long> {
    @Query(value = "select * from blog where title like :searchName", nativeQuery = true)
    List<Blog> searchByName(@Param("searchName") String searchName);

    Page<Blog> findBlogByTitleContaining(String s, Pageable pageable);
}
