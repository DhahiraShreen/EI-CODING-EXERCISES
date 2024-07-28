package com.example.decorator;

public class BasicNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending notification: " + message);
    }
}
