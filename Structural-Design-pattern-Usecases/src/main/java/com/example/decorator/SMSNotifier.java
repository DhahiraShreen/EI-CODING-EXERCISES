package com.example.decorator;

import java.util.logging.Logger;

public class SMSNotifier extends NotifierDecorator {
    private static final Logger logger = Logger.getLogger(SMSNotifier.class.getName());

    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSMS(message);
    }

    private void sendSMS(String message) {
        logger.info("Sending SMS notification: " + message);
        System.out.println("SMS: " + message);
    }
}
