package com.example.libarry.service;


import com.example.libarry.model.Book;

import java.util.List;

public interface IBookService {

    public List<Book> findAllBooks();
    public Book findBookById(Long id);
    public void borrowBook(Long bookId);
    public void returnBook(String borrowCode);
}
