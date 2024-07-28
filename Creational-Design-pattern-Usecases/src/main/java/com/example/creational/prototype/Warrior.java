package com.example.creational.prototype;

import java.util.logging.Logger;

public class Warrior extends Character {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".prototype");

    public Warrior() {
        type = "Warrior";
        weapon = "Sword";
        armor = "Plate";
    }

    @Override
    void attack() {
        logger.info("Warrior attacks with " + weapon);
        System.out.println("Warrior attacks with " + weapon);
    }
}
