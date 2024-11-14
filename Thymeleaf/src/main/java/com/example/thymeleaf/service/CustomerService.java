package com.example.thymeleaf.service;

import com.example.thymeleaf.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {
    private static final Map<Integer, Customer> customers = new HashMap<>();

    static {
        customers.put(1,new Customer(1, "John", "john@example.com", "123 Main St"));
        customers.put(2,new Customer(2, "Adam", "adam@example.com", "456 Main St"));
        customers.put(3,new Customer(3, "Sweet", "sweet@example.com", "789 Main St"));
        customers.put(4,new Customer(4, "Smith", "smith@example.com", "999 Main St"));
    }

    @Override
    public List<Customer> finAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public void deleteById(int id) {
        customers.remove(id);
    }

    @Override
    public Customer finById(int id) {
        return customers.get(id);
    }
}
