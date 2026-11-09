package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    // Derived: price based off Room Type
    public double getPrice() {
        double price;
        if ( roomType.equalsIgnoreCase("King") ) {
            price = 139;
        } else{
            price = 124;
        }

        if ( weekend ) {
            price += price * 0.1;
        }
        return price;
    }

    // Derived: uses price and number of nights
    public double getReservationTotal(){
        return getPrice() * numberOfNights;
    }

}
