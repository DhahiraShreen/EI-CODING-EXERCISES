package com.example.creational.logging;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class PrototypeLoggingConfig {
    public static void setup() {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".prototype");
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false); // Disable default console logging

        try {
            // Set up file handler
            FileHandler fileHandler = new FileHandler("prototype_application.log", true); // Append to log file
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            // Set up console handler
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.ALL);
            consoleHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(consoleHandler);

            // Log initial message to confirm setup
            logger.info("Prototype Logging setup complete. This should appear in the log file.");

        } catch (IOException e) {
            System.err.println("Failed to set up file handler for logger: " + e.getMessage());
        }
    }
}
