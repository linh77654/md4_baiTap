package com.example.spring_mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class StudentController {

    @GetMapping("/students")
    public String showList(){
        return "students";
    }
}
