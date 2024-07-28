package com.example.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class StockMarket {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".observer");
    private List<StockObserver> observers = new ArrayList<>();
    private double stockPrice;

    public void addObserver(StockObserver observer) {
        observers.add(observer);
        logger.info("Added observer: " + observer.getClass().getName());
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
        logger.info("Removed observer: " + observer.getClass().getName());
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        logger.info("Set stock price: " + stockPrice);
        notifyObservers();
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(stockPrice);
        }
    }
}
