package com.example.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void showItems() {
        for (String item : items) {
            System.out.println("Item: " + item);
        }
    }

    @Override
    public String toString() {
        return "Meal{" +
                "items=" + items +
                '}';
    }
}
