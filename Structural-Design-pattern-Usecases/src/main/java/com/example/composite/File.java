package com.example.composite;

import java.util.logging.Logger;

public class File implements FileSystemComponent {
    private String name;
    private static final Logger logger = Logger.getLogger(File.class.getName());

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        logger.info("Showing file: " + name);
        System.out.println("File: " + name);
    }
}
