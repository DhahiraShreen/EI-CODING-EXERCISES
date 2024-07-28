package com.example.decorator;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class DecoratorLoggingConfig {
    public static void setup() {
        Logger logger = Logger.getLogger("");
        FileHandler fileHandler;

        try {
            fileHandler = new FileHandler("decorator_application.log", true);
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }
}
