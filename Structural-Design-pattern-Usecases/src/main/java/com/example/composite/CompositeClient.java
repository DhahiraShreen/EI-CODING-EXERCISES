package com.example.composite;

import java.util.Scanner;
import java.util.logging.Logger;

public class CompositeClient {
    private static final Logger logger = Logger.getLogger(CompositeClient.class.getName());

    public static void main(String[] args) {
        CompositeLoggingConfig.setup();
        logger.info("Starting CompositeClient");

        Scanner scanner = new Scanner(System.in);

        Directory rootDirectory = new Directory("Root");
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Enter 1 to add a file, 2 to add a directory, 3 to show details, 0 to exit:");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter file name:");
                    String fileName = scanner.nextLine();
                    FileSystemComponent file = new File(fileName);
                    rootDirectory.addComponent(file);
                    break;
                case 2:
                    System.out.println("Enter directory name:");
                    String dirName = scanner.nextLine();
                    Directory directory = new Directory(dirName);
                    rootDirectory.addComponent(directory);
                    break;
                case 3:
                    rootDirectory.showDetails();
                    break;
                case 0:
                    logger.info("Exiting CompositeClient");
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
