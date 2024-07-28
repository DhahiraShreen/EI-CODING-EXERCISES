package com.example.decorator;

import java.util.logging.Logger;

public class PushNotifier extends NotifierDecorator {
    private static final Logger logger = Logger.getLogger(PushNotifier.class.getName());

    public PushNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendPush(message);
    }

    private void sendPush(String message) {
        logger.info("Sending push notification: " + message);
        System.out.println("Push: " + message);
    }
}
