package com.example.sandwich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {

    @RequestMapping("/")
    public String sandwich() {
        return "sandwich";
    }

    @RequestMapping("/save")
    public ModelAndView save(@RequestParam(value = "condiment", required = false) String[] condiment) {
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("condiment", condiment == null ? new String[]{} : condiment);
        return modelAndView;
    }
}
