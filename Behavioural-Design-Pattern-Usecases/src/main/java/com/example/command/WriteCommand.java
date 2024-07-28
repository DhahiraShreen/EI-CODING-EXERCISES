package com.example.command;

import java.util.logging.Logger;

public class WriteCommand implements Command {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".command");
    private Document document;
    private String text;

    public WriteCommand(Document document, String text) {
        this.document = document;
        this.text = text;
    }

    @Override
    public void execute() {
        document.write(text);
        logger.info("write command occurred. Text: " + text);
    }

    @Override
    public void undo() {
        document.eraseLast();
        logger.info("undo write command occurred");
    }
}
