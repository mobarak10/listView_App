package com.example.listview;

public class Animal {
    private String image;
    private String name;
    private String details;

    public Animal(String image, String name, String details) {
        this.image = image;
        this.name = name;
        this.details = details;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }
}
