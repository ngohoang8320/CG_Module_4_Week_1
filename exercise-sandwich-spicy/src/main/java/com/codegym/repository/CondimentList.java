package com.codegym.repository;

import com.codegym.model.SandwichCondiment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CondimentList {
    private static List<String> condimentList = new ArrayList<>();

    static {
        condimentList.add((new SandwichCondiment("Lettuce")).toString());
        condimentList.add((new SandwichCondiment("Tomato")).toString());
        condimentList.add((new SandwichCondiment("Mustard")).toString());
        condimentList.add((new SandwichCondiment("Sprouts")).toString());
    }

    public List<String> getCondiments() {
        return condimentList;
    }
}
