package com.example.command;

import java.util.logging.Logger;

public class UndoCommand implements Command {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".command");
    private Document document;

    public UndoCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.undo();
        logger.info("undo command occurred");
    }

    @Override
    public void undo() {
        document.redo();
        logger.info("redo undo command occurred");
    }
}
