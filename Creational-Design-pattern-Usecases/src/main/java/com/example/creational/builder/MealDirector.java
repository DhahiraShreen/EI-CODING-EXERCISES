package com.example.creational.builder;

import java.util.logging.Logger;

public class MealDirector {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".builder");
    private MealBuilder builder;

    public MealDirector(MealBuilder builder) {
        this.builder = builder;
    }

    public Meal prepareVegMeal() {
        logger.info("Preparing Veg Meal");
        return builder.addBurger("Veggie Burger")
                .addDrink("Coke")
                .addDessert("Ice Cream")
                .build();
    }

    public Meal prepareNonVegMeal() {
        logger.info("Preparing Non-Veg Meal");
        return builder.addBurger("Chicken Burger")
                .addDrink("Pepsi")
                .addDessert("Cake")
                .build();
    }
}
