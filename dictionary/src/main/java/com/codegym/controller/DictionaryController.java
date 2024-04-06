package com.codegym.controller;

import com.codegym.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping(value = "find")
    public String findWord(@RequestParam String word,
                           Model model) {
        String result = dictionaryService.findWord(word);
        model.addAttribute("result",
                result);
        return "output";
    }

    @GetMapping
    public String display() {
        return "input";
    }
}
