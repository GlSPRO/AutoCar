package com.example.autochoice;

public class Car {
    private String name;
    private String shortDescription;
    private String details;
    private int imageResourceId;

    public Car(String name, String shortDescription, String details, int imageResourceId) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.details = details;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDetails() {
        return details;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}