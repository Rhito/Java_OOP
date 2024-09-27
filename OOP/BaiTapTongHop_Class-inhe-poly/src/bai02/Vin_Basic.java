package bai02;

import java.util.Scanner;

public class Vin_Basic {
    // ID, Area (diện tích), Floor (Tầng), Price (Giá). Đối với căn hộ cao cấp thì có
    //thêm thông tin về View (Hướng (Biển, Thành phố, Hồ bơi, …))
    private String id;
    private double area;
    private int floor;
    private double price;
    public Vin_Basic() {}
    public Vin_Basic(String id, double area, int floor, double price) {
        this.id = id;
        this.area = area;
        this.floor = floor;
        this.price = price;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public void calcPrice() {
        setPrice(this.area * this.floor);
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = sc.nextLine();
        System.out.print("Enter area: ");
        area = sc.nextDouble();
        System.out.print("Enter floor: ");
        floor = sc.nextInt();
        calcPrice();
    }
    public void output() {
        System.out.println("ID: " + id);
        System.out.println("Area: " + area);
        System.out.println("Floor: " + floor);
        System.out.println("Price: " + price);
    }
}
