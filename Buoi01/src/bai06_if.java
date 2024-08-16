import java.util.Scanner;

public class bai06_if {
     public static double tinhluong(double luong) {
        double luongquathue = 0;
        if (luong > 15000000){
            luongquathue = luong * 0.7; // -30%
        }else if (luong >= 7000000) {
            luongquathue = luong * 0.8; // -20%
        }else if (luong < 7000000) {
            luongquathue = luong * 0.9; // -10%
        }
        return luongquathue;
    }
    public static double tinhthue(double luong) {
         double thue=0;
        if (luong > 15000000){
           thue = luong * 0.3; // -30%
        }else if (luong >= 7000000) {
            thue = luong * 0.2; // -20%
        }else if (luong < 7000000) {
            thue = luong * 0.1; // -10%
        }
        return thue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lương: ");
        double luong = sc.nextInt();
        // bay loi nguoi dung?
        while(luong <= 0){
            System.out.println("Nhập vào dữ liệu sai nhập lại, Vui lòng nhập lại!");
            System.out.print("Nhập vào số lương: ");
             luong = sc.nextInt();
        }
        System.out.println("Lương qua thuế là: "+tinhluong(luong));
        System.out.println("Thuế là: "+tinhthue(luong));

    }
}
