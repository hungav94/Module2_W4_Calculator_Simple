package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculator {

    @GetMapping("")
    public String index() {
        return "index";
    }

    @PostMapping("result")
    public ModelAndView calculator(double operand1, double operand2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "x":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
        }
        ModelAndView modelAndView = new ModelAndView("index", "result", result);
        return modelAndView;
    }
}
