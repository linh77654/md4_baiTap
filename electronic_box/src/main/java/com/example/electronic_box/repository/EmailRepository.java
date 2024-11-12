package com.example.electronic_box.repository;

import com.example.electronic_box.model.Email;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailRepository implements IEmailRepository {
    private static List<Email> emails = new ArrayList<>();

    @Override
    public List<Email> getAllemail() {
        return new ArrayList<>(emails);
    }

    @Override
    public void save(Email email) {
        emails.add(email);
    }
}
