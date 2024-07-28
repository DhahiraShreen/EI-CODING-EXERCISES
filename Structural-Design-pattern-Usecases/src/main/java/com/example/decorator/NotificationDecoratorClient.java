package com.example.decorator;

import java.util.Scanner;
import java.util.logging.Logger;

public class NotificationDecoratorClient {
    private static final Logger logger = Logger.getLogger(NotificationDecoratorClient.class.getName());

    public static void main(String[] args) {
        DecoratorLoggingConfig.setup();
        logger.info("Starting NotificationDecoratorClient");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter message to send:");
        String message = scanner.nextLine();

        Notifier notifier = new BasicNotifier();
        boolean keepRunning = true;
        
        while (keepRunning) {
            System.out.println("Choose notification types to add (1-Email, 2-SMS, 3-Push, 4-Done):");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    notifier = new EmailNotifier(notifier);
                    break;
                case 2:
                    notifier = new SMSNotifier(notifier);
                    break;
                case 3:
                    notifier = new PushNotifier(notifier);
                    break;
                case 4:
                    notifier.send(message);
                    logger.info("Final notification sent: " + message);
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
