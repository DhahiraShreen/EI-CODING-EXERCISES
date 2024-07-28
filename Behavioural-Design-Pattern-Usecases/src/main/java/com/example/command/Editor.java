package com.example.command;

import java.util.Stack;
import java.util.logging.Logger;

public class Editor {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".command");
    private Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
        logger.info("Executed command: " + command.getClass().getSimpleName());
    }

    public void undoCommand() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
            logger.info("Undid command: " + command.getClass().getSimpleName());
        }
    }
}
