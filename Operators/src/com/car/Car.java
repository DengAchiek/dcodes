package com.car;

public class Car {
    private String make;
    private int doors;

    // Constructor
    public Car(String make, int doors) {
        this.make = make;
        this.doors = doors;
    }

    // I will create a method to display details
    public void showDetails() {
        System.out.println("Make: " + make);
        System.out.println("Doors: " + doors);
    }

    public static void main(String[] args) {
        // now i will Create two objects and initialize them
        Car car1 = new Car("Toyota", 4);
        Car car2 = new Car("Honda", 2);

        // then print or Display details of the cars
        System.out.println("The information or details of Car 1:");
        car1.showDetails();
        System.out.println();

        System.out.println("The information or details of Car 2:");
        car2.showDetails();
    }
}
