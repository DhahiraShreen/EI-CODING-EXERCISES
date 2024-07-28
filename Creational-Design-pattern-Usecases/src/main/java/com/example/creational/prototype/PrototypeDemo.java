package com.example.creational.prototype;

import com.example.creational.logging.PrototypeLoggingConfig;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrototypeDemo {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".prototype");

    public static void main(String[] args) {
        PrototypeLoggingConfig.setup();
        CharacterCache.loadCache();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of character to clone (Warrior or Mage):");
        String characterType = scanner.nextLine().toUpperCase();

        Character clonedCharacter;
        switch (characterType) {
            case "WARRIOR":
                clonedCharacter = CharacterCache.getCharacter("1");
                break;
            case "MAGE":
                clonedCharacter = CharacterCache.getCharacter("2");
                break;
            default:
                logger.log(Level.SEVERE, "Unknown character type: " + characterType);
                System.out.println("Unknown character type: " + characterType);
                return;
        }

        logger.log(Level.INFO, "Character cloned: " + clonedCharacter.getType());
        System.out.println("Character cloned: " + clonedCharacter.getType());
        clonedCharacter.attack();

        // Allow customization
        System.out.println("Enter new weapon for the " + clonedCharacter.getType() + ":");
        String newWeapon = scanner.nextLine();
        clonedCharacter.setWeapon(newWeapon);
        System.out.println("Enter new armor for the " + clonedCharacter.getType() + ":");
        String newArmor = scanner.nextLine();
        clonedCharacter.setArmor(newArmor);

        logger.log(Level.INFO, clonedCharacter.getType() + " customized with weapon: " + clonedCharacter.getWeapon() + " and armor: " + clonedCharacter.getArmor());
        System.out.println(clonedCharacter.getType() + " customized with weapon: " + clonedCharacter.getWeapon() + " and armor: " + clonedCharacter.getArmor());
        clonedCharacter.attack();

        scanner.close();
    }
}
