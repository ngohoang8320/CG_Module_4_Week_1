package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.ISandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/choose")
public class SandwichController {

    @Autowired
    private ISandwichService sandwichService;

    @GetMapping
    public String showCondiments(Model model) {
        List<String> sandwichCondimentsList = sandwichService.show();
        model.addAttribute("customer",
                new Customer());
        model.addAttribute("sandwichList",
                sandwichCondimentsList);
        return "chooseCondiment";
    }

    @PostMapping("/result")
    public String result(@ModelAttribute Customer customer,
                         Model model) {
        model.addAttribute("customer",
                customer);
        return "showResult";
    }
}
