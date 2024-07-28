package com.example.command;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CommandLoggingConfig {
    public static void setup() {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".command");
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false); // Disable default console logging

        try {
            // Set up file handler
            FileHandler fileHandler = new FileHandler("command_application.log", true); // Append to log file
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            // Set up console handler
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.ALL);
            consoleHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(consoleHandler);

            // Log initial message to confirm setup
            logger.info("Command Logging setup complete. ");

        } catch (IOException e) {
            System.err.println("Failed to set up file handler for logger: " + e.getMessage());
        }
    }
}
