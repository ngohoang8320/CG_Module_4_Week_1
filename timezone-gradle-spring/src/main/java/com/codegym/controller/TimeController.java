package com.codegym.controller;

import com.codegym.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class TimeController {

    @Autowired
    TimeService timeService;

    @GetMapping
    public String showPage() {
        return "index";
    }

    @GetMapping("/world-clock")
    public String getTimeByTimezone(ModelMap model,
                                    @RequestParam(name = "city", required = false, defaultValue = "Asia/Ho_Chi_Minh") String city) {

        Date date = timeService.displayTime(city);

        model.addAttribute("city",
                city);
        model.addAttribute("date",
                date);
        return "index";
    }
}