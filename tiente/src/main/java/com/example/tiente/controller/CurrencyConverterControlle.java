package com.example.tiente.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CurrencyConverterControlle {

    @GetMapping("/")
    public String homepage(){
        return "home";
    }

    @PostMapping("/converter")
    public String converter(@RequestParam("rate") double rate, @RequestParam("usd") double usd, Model model){
        double vnd = rate * usd;
        model.addAttribute("vnd", vnd);
        return "converter";
    }
}
