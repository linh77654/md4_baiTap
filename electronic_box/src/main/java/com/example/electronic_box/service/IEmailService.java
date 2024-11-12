package com.example.electronic_box.service;


import com.example.electronic_box.model.Email;

import java.util.List;

public interface IEmailService {
    List<Email> getAllEmails();
    void save(Email emails);
}
