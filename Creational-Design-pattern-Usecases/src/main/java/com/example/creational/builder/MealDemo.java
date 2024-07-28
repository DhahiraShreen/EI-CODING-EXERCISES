package com.example.creational.builder;

import com.example.creational.logging.BuilderLoggingConfig;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MealDemo {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".builder");

    public static void main(String[] args) {
        BuilderLoggingConfig.setup();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of meal (VEG, NON_VEG):");
        String type = scanner.nextLine().toUpperCase();

        MealBuilder builder = new MealBuilder();
        MealDirector director = new MealDirector(builder);
        Meal meal;

        switch (type) {
            case "VEG":
                meal = director.prepareVegMeal();
                break;
            case "NON_VEG":
                meal = director.prepareNonVegMeal();
                break;
            default:
                logger.log(Level.SEVERE, "Unknown meal type: " + type);
                System.out.println("Unknown meal type: " + type);
                return;
        }

        System.out.println("Meal prepared:");
        meal.showItems();
        logger.info("Meal prepared: " + meal);

        // Allow customization
        System.out.println("Would you like to customize your meal? (yes/no)");
        String customize = scanner.nextLine().toLowerCase();
        if (customize.equals("yes")) {
            System.out.println("Enter custom burger:");
            String customBurger = scanner.nextLine();
            System.out.println("Enter custom drink:");
            String customDrink = scanner.nextLine();
            System.out.println("Enter custom dessert:");
            String customDessert = scanner.nextLine();

            builder.addBurger(customBurger).addDrink(customDrink).addDessert(customDessert);
            meal = builder.build();

            System.out.println("Customized meal:");
            meal.showItems();
            logger.info("Customized meal: " + meal);
        }

        scanner.close();
    }
}
