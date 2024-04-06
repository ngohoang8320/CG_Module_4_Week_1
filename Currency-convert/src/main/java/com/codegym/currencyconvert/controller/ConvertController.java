package com.codegym.currencyconvert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping(value = "/convert")
    public String convert(@RequestParam double money,
                          Model model) {
        double newMoney = money * 22000;
        model.addAttribute("newMoney",
                newMoney);
        return "output";
    }

    @GetMapping
    public String setInput() {
        return "input";
    }
}
