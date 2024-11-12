package com.example.electronic_box.service;

import com.example.electronic_box.model.Email;
import com.example.electronic_box.repository.IEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmailService implements IEmailService {

    @Autowired
    private IEmailRepository emailRepository;

    @Override
    public List<Email> getAllEmails() {
        return emailRepository.getAllemail();
    }

    @Override
    public void save(Email emails) {
        emailRepository.save(emails);
    }
}
