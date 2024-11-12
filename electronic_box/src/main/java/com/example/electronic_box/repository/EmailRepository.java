package com.example.electronic_box.repository;

import com.example.electronic_box.model.Email;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class EmailRepository implements IEmailRepository {
    private static List<Email> emails = new ArrayList<Email>();

    @Override
    public boolean save(Email email) {
        return emails.add(email);
    }
}
