package com.example.thymeleaf.service;

import com.example.thymeleaf.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> finAll();

    void save(Customer customer);

    void deleteById(int id);

    Customer finById(int id);
}
