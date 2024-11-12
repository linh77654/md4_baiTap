package com.example.electronic_box.repository;

import com.example.electronic_box.model.Email;

public interface IEmailRepository {
    boolean save(Email email);
}
