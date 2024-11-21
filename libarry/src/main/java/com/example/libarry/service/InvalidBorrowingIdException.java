package com.example.libarry.service;

public class InvalidBorrowingIdException extends RuntimeException {
    public InvalidBorrowingIdException(String message) {
        super(message);
    }
}