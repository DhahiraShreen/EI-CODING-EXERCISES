package com.example.creational.builder;

import java.util.logging.Logger;

public class MealBuilder {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".builder");
    private Meal meal;

    public MealBuilder() {
        this.meal = new Meal();
    }

    public MealBuilder addBurger(String burger) {
        meal.addItem("Burger: " + burger);
        logger.info("Added Burger: " + burger);
        return this;
    }

    public MealBuilder addDrink(String drink) {
        meal.addItem("Drink: " + drink);
        logger.info("Added Drink: " + drink);
        return this;
    }

    public MealBuilder addDessert(String dessert) {
        meal.addItem("Dessert: " + dessert);
        logger.info("Added Dessert: " + dessert);
        return this;
    }

    public Meal build() {
        logger.info("Built Meal: " + meal);
        return meal;
    }
}
