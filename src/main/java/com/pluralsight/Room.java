package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean dirty, boolean occupied) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.dirty = dirty;
        this.occupied = occupied;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    // Available only when clean and not occupied
    public boolean isAvailable() {
        return !dirty && !occupied;
    }
}