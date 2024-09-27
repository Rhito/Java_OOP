package Bai07;

public class Vehicle {
    // Tạo lớp Vehicle với các thuộc tính brand và speed.
    private String brand;
    private int speed;
    public Vehicle() {}
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void output() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }

}
