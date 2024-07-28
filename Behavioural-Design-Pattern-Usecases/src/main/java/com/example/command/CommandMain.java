package com.example.command;

import java.util.Scanner;
import java.util.logging.Logger;

public class CommandMain {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".command");

    public static void main(String[] args) {
        CommandLoggingConfig.setup();
        logger.info("Starting CommandMain");

        Document document = new Document();
        Editor editor = new Editor();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter a command (write, undo, redo, exit):");
            String command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "write":
                    System.out.println("Enter text to write:");
                    String text = scanner.nextLine();
                    editor.executeCommand(new WriteCommand(document, text));
                    logger.info("write command occurred. Text: " + text);
                    break;
                case "undo":
                    editor.undoCommand();
                    logger.info("undo command occurred.");
                    break;
                case "redo":
                    editor.executeCommand(new RedoCommand(document));
                    logger.info("redo command occurred.");
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
                    logger.warning("Invalid command entered: " + command);
            }
        }

        scanner.close();
        logger.info("Exiting CommandMain");
    }
}
