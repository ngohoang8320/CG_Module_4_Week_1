package com.codegym.model;

public class Customer {
    private String[] chosen;

    public Customer(String[] chosen) {
        this.chosen = chosen;
    }

    public Customer() {
    }

    public String[] getChosen() {
        return chosen;
    }

    public void setChosen(String[] chosen) {
        this.chosen = chosen;
    }
}
