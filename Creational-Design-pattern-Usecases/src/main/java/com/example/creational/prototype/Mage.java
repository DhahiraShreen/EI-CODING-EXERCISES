package com.example.creational.prototype;

import java.util.logging.Logger;

public class Mage extends Character {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".prototype");

    public Mage() {
        type = "Mage";
        weapon = "Staff";
        armor = "Robe";
    }

    @Override
    void attack() {
        logger.info("Mage casts a spell with " + weapon);
        System.out.println("Mage casts a spell with " + weapon);
    }
}
