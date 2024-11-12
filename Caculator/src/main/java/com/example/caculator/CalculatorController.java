package com.example.caculator;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calculator")
    public String calculator(@RequestParam double number1, @RequestParam double number2, @RequestParam String operator, Model model) {
        double result = 0;
        try {
            switch (operator) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    if (number2 != 0) {
                        result = number1 / number2;
                    } else {
                        model.addAttribute("error", "Cannot divide by zero");
                        return "index";
                    }
                    break;
                case "%":
                    if (number2 != 0) {
                        result = (number1 / number2) * 100;
                    } else {
                        model.addAttribute("error", "Cannot divide by zero");
                        return "index";
                    }
                    break;
                case "^":
                    result = Math.pow(number1, number2);
                    break;
                default:
                    model.addAttribute("error", "Invalid operation");
                    return "index";
            }
            model.addAttribute("result", result);
        } catch (NumberFormatException e) {
            model.addAttribute("error", "Invalid number format");
        }
        return "index";
    }
}