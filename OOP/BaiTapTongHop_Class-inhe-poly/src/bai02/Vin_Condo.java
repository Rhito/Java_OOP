package bai02;

import java.util.Scanner;

public class Vin_Condo extends Vin_Basic{
    private double view;

    public Vin_Condo() {}
    public Vin_Condo(String id, double area, int floor, double price, double view) {
        super(id, area, floor, price);
        this.view = view;
    }
    public double getView() {
        return view;
    }
    public void setView(double view) {
        this.view = view;
    }
    public void calcPrice() {
        setPrice(getArea() * getFloor() * view);
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        //Biển: 1.4; Hồ bơi: 1.1; Thành phố:1.2; Khác: 1.0
        System.out.println("Input view: ");
        System.out.println("1. Biển");
        System.out.println("2. Hồ bơi");
        System.out.println("3. Thành phố");
        System.out.println(". Khác");
        System.out.print("Chose a view: ");
        int chosen ;
        do {
            System.out.print("Chọn loại view (1-4): ");
            chosen = sc.nextInt();
            switch (chosen) {
                case 1:
                    view = 1.4;
                    break;
                case 2:
                    view = 1.1;
                    break;
                case 3:
                    view = 1.2;
                    break;
                case 4:
                    view = 1.0;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    break;
            }
        } while (chosen < 1 || chosen > 4);
        calcPrice();
    }
    public void output() {
        super.output();
        //Biển: 1.4; Hồ bơi: 1.1; Thành phố:1.2; Khác: 1.0
        System.out.print("View: ");
       if(view == 1.4) {
           System.out.println(" Biển");
       }
       else if(view == 1.1) {
           System.out.println(" Hồ bơi");
       }
       else if(view == 1.2) {
           System.out.println(" Thành phố");
       }
       else {
           System.out.println("Khác");
       }
    }
}
