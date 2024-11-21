package com.example.libarry.handle;

import com.example.libarry.service.BookUnavailableException;
import com.example.libarry.service.InvalidBorrowingIdException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BookUnavailableException.class)
    public String handleBookUnavailableException(BookUnavailableException ex, Model model) {
        model.addAttribute("errorMessage", ex.getMessage());
        return "templates/book/error/book-unavailable";
    }

    @ExceptionHandler(InvalidBorrowingIdException.class)
    public String handleInvalidBorrowingIdException(InvalidBorrowingIdException ex, Model model)
    { model.addAttribute("errorMessage", ex.getMessage()); return "templates/book/error/invalid-borrow-id"; } }