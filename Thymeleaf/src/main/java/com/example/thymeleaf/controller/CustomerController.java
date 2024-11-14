package com.example.thymeleaf.controller;


import com.example.thymeleaf.model.Customer;
import com.example.thymeleaf.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public String index(Model model) {
        List<Customer> customers = customerService.finAll();
        model.addAttribute("customers", customers);
        return "index";
    }

    @GetMapping("/create")
    public String create(Customer customer) {
        customerService.save(customer);
        return "redirect:/customers";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable int id, Customer customer) {
        customer.setId(id);
        customerService.save(customer);
        return "redirect:/customers";
    }

    @GetMapping("/delate/{id}")
    public String deleteConfirmed(@PathVariable int id) {
        customerService.deleteById(id);
        return "redirect:/customers";
    }

    @GetMapping("/delete/{id}")
    public String detail(@PathVariable int id, Model model) {
        Customer customer = customerService.finById(id);
        model.addAttribute("customer", customer);
        return "detail";
    }

}
