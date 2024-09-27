package Bai07;

public class Bike extends Vehicle {
    private int numOfWheels;
    public Bike(){}
    public Bike(String brand, int speed, int numOfWheels) {
        super(brand, speed);
        this.numOfWheels = numOfWheels;
    }
    public void output() {
        super.output();
        System.out.println("Car wheels: " + this.numOfWheels);
        System.out.println();
    }
}
