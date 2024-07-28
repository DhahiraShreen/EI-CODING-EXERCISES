package com.example.decorator;

import java.util.logging.Logger;

public class EmailNotifier extends NotifierDecorator {
    private static final Logger logger = Logger.getLogger(EmailNotifier.class.getName());

    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendEmail(message);
    }

    private void sendEmail(String message) {
        logger.info("Sending email notification: " + message);
        System.out.println("Email: " + message);
    }
}
