package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void add(Product product) {
        productRepository.add(product);
    }

    public Product findById(int id) {
        return productRepository.findById(id);
    }

    public void update(Product product) {
        productRepository.remove(product.getId());
        productRepository.add(product);
    }

    public void delete(int id) {
        productRepository.remove(id);
    }
}
