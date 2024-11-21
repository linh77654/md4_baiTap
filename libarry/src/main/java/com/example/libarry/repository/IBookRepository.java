package com.example.libarry.repository;


import com.example.libarry.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface IBookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByTitle(String title);
}