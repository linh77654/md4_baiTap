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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/email")
public class EmailController {
    private Email email = new Email();

    @GetMapping("")
    public String Email(Model model) {
        model.addAttribute("email", email);
        model.addAttribute("languages", new String[]{"English", "Vietnamese", "Japanese", "Chinese"});
        model.addAttribute("pageSizes", new int[]{5, 10, 15, 25, 50, 100});
        return "emailForm";
    }

    @PostMapping("/emailList")
    public String emailList(@ModelAttribute Email email, RedirectAttributes redirectAttributes) {
        this.email.setLanguage(email.getLanguage());
        this.email.setPageSize(email.getPageSize());
        this.email.setSpamFilter(email.getSpamFilter());
        this.email.setSignature(email.getSignature());
        redirectAttributes.addAttribute("message", "Update config successfully");
        return "emailList";
    }
}
//    @Autowired
//    private EmailService emailService;
//
//    @GetMapping("")
//    public String emailForm(@ModelAttribute("email") Email email) {
//        List<Email> emailList = emailService.getAllEmails();
//        return "emailForm";
//    }
//
//    @PostMapping("/emailList")
//    public String emailSave(@ModelAttribute("email") Email email, Model model) {
//        emailService.save(email);
//        model.addAttribute("email", email);
//        return "emailList";
//    }
