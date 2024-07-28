package com.example.creational.prototype;

import java.util.Hashtable;
import java.util.logging.Logger;

public class CharacterCache {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".prototype");
    private static Hashtable<String, Character> characterMap = new Hashtable<>();

    public static Character getCharacter(String characterId) {
        Character cachedCharacter = characterMap.get(characterId);
        logger.info("Cloning character with ID: " + characterId);
        return (Character) cachedCharacter.clone();
    }

    public static void loadCache() {
        Warrior warrior = new Warrior();
        warrior.setId("1");
        characterMap.put(warrior.getId(), warrior);
        logger.info("Loaded Warrior into cache");

        Mage mage = new Mage();
        mage.setId("2");
        characterMap.put(mage.getId(), mage);
        logger.info("Loaded Mage into cache");
    }
}
