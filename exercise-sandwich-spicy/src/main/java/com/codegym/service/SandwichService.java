package com.codegym.service;

import com.codegym.repository.CondimentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SandwichService implements ISandwichService {
    @Autowired
    CondimentList condimentList;

    @Override
    public List<String> show() {
        return condimentList.getCondiments();
    }
}
