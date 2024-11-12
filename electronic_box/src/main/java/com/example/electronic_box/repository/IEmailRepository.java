package com.example.electronic_box.repository;


import com.example.electronic_box.model.Email;

import java.util.List;

public interface IEmailRepository {

    List<Email> getAllemail();

    void save(Email emails);
}
