package com.codegym.model;

public class SandwichCondiment {
    private String condiment;

    public SandwichCondiment() {
    }

    public SandwichCondiment(String condiment) {
        this.condiment = condiment;
    }

    public String getCondiment() {
        return condiment;
    }

    public void setCondiment(String condiment) {
        this.condiment = condiment;
    }

    @Override
    public String toString() {
        return condiment;
    }
}
