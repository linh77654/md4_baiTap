package com.example.electronic_box.controller;

import com.example.electronic_box.model.Email;
import com.example.electronic_box.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/emailList")
    public String emailList(Model model) {
        Email email = new Email();
        model.addAttribute("email", email);
        return "emailList";
    }


    @PostMapping("/emailList")
    public String emailSave(@ModelAttribute("email") Email email) {
        emailService.save(email);
        return "emailList";
    }

    @GetMapping("")
    public String emailForm(@ModelAttribute("email") Email email) {
        List<Email> emailList = emailService.getAllEmails();
        return "emailForm";
    }


}
