package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

        // ----- Room -----
        // Constructor order: numberOfBeds, price, dirty, occupied
        Room room = new Room(2, 139.00, false, true);   // Clean but occupied
        System.out.println("Beds: " + room.getNumberOfBeds());
        System.out.println("Available? " + room.isAvailable());
        // Expected: 2, false

        // ----- Reservation -----
        // Constructor order: roomType, numberOfNights, weekend
        Reservation reservation = new Reservation("king", 4, true);
        System.out.printf("Price per night: $%.2f%n", reservation.getPrice());
        System.out.printf("Total: $%.2f%n", reservation.getReservationTotal());
        // Expected: 152.90 per night, 611.60 total

        // ----- Employee -----
        // Constructor order: employeeId, name, department, payRate, hoursWorked
        Employee employee = new Employee("E101", "x", "Housekeeping", 17.5, 44);
        System.out.println("Regular hours: " + employee.getRegularHours());
        System.out.println("Overtime hours: " + employee.getOvertimeHours());
        System.out.printf("Total pay: $%.2f%n", employee.getTotalPay());
        // Expected: 40.0, 4.0, 805.00
    }
}