package com.codegym.controller;

import com.codegym.model.Parameter;
import com.codegym.service.CalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class CalController {

    @Autowired
    CalService calService;

    @GetMapping
    public String showCal(Model model,
                          @RequestParam(defaultValue = "add") String button,
                          @ModelAttribute Parameter param) {
        double result = 0;
        if (param == null) {
            param = new Parameter();
        }
        switch (button) {
            case "add":
                result = calService.add(param);
                break;
            case "sub":
                result = calService.sub(param);
                break;
            case "mul":
                result = calService.mul(param);
                break;
            default:
                result = calService.div(param);
                break;
        }
        model.addAttribute("param",
                param);
        model.addAttribute("result",
                result);
        return "cal";
    }


}
