package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public String product(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("productList",
                productList);
        return "list";
    }

    @GetMapping("/create")
    public String add(Model model) {
        model.addAttribute("product",
                new Product());
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Product product) {
        productService.add(product);
        return "redirect:/products";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id,
                       Model model) {
        Product product = productService.findById(id);
        model.addAttribute("product",
                product);
        return "edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Product product) {
        productService.update(product);
        return "redirect:/products";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id) {
        productService.delete(id);
        return "redirect:/products";
    }
}
