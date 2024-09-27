package Bai07;

public class Car extends Vehicle {
    private int numOfWheels;
    public Car() {}
    public Car(String brand, int speed, int numOfWheels) {
        super(brand, speed);
        this.numOfWheels = numOfWheels;
    }
    public void output() {
        super.output();
        System.out.println("Car wheels: " + this.numOfWheels);
        System.out.println();
    }
}
