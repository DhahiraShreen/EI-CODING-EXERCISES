package com.example.observer;

import java.util.Scanner;
import java.util.logging.Logger;

public class ObserverMain {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".observer");

    public static void main(String[] args) {
        ObserverLoggingConfig.setup();
        logger.info("Starting ObserverMain");

        StockMarket stockMarket = new StockMarket();

        StockObserver tradingApp = new TradingApp();
        StockObserver newsPortal = new NewsPortal();
        StockObserver financialAnalysisTool = new FinancialAnalysisTool();

        stockMarket.addObserver(tradingApp);
        stockMarket.addObserver(newsPortal);
        stockMarket.addObserver(financialAnalysisTool);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter new stock price (or type 'exit' to quit):");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                running = false;
                continue;
            }

            try {
                double newPrice = Double.parseDouble(input);
                stockMarket.setStockPrice(newPrice);
                logger.info("Stock price updated to: " + newPrice);
            } catch (NumberFormatException e) {
                logger.severe("Invalid input. Please enter a valid number.");
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        scanner.close();
        logger.info("Exiting ObserverMain");
    }
}
