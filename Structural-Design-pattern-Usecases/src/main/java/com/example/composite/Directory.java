package com.example.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();
    private static final Logger logger = Logger.getLogger(Directory.class.getName());

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
        logger.info("Added component to directory: " + name);
    }

    @Override
    public void showDetails() {
        logger.info("Showing directory: " + name);
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}
