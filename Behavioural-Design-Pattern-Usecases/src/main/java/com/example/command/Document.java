package com.example.command;

import java.util.Stack;
import java.util.logging.Logger;

public class Document {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME + ".command");
    private StringBuilder content = new StringBuilder();
    private Stack<String> history = new Stack<>();
    private Stack<String> redoStack = new Stack<>();

    public void write(String text) {
        content.append(text);
        history.push(text);
        redoStack.clear();
        logger.info("write command occurred. Text: " + text);
        System.out.println("Document content: " + content.toString());
    }

    public void eraseLast() {
        if (!history.isEmpty()) {
            String lastText = history.pop();
            redoStack.push(lastText);
            content.setLength(content.length() - lastText.length());
            logger.info("erase command occurred. Erased text: " + lastText);
            System.out.println("Document content after erase: " + content.toString());
        }
    }

    public void undo() {
        if (!history.isEmpty()) {
            String lastText = history.pop();
            redoStack.push(lastText);
            content.setLength(content.length() - lastText.length());
            logger.info("undo command occurred. Undid text: " + lastText);
            System.out.println("Document content after undo: " + content.toString());
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            String lastText = redoStack.pop();
            content.append(lastText);
            history.push(lastText);
            logger.info("redo command occurred. Redid text: " + lastText);
            System.out.println("Document content after redo: " + content.toString());
        }
    }
}
