package com.example.command;

import java.util.logging.Logger;

public class RedoCommand implements Command {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".command");
    private Document document;

    public RedoCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.redo();
        logger.info("redo command occurred");
    }

    @Override
    public void undo() {
        document.undo();
        logger.info("undo redo command occurred");
    }
}
