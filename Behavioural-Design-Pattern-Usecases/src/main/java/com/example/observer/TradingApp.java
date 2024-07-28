package com.example.observer;

import java.util.logging.Logger;

public class TradingApp implements StockObserver {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".observer");

    @Override
    public void update(double stockPrice) {
        logger.info("Trading App: New stock price is " + stockPrice);
    }
}
