package bai02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Viết chương trình quản lý căn hộ và tính giá cho từng căn hộ đó.
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số căn hộ: "); int n = sc.nextInt();
        ArrayList<Vin_Basic> lstAp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập số căn hộ thứ "+ (i+1) + ": ");
            System.out.print("Chọn loại căn hộ: Basic(1) ||  Condo(2) : ");
            int ch;
            Vin_Basic ap;
                ch = sc.nextInt();
                if(ch==1){
                     ap = new Vin_Basic();
                }else{
                     ap = new Vin_Condo();
                }
                ap.input();
                lstAp.add(ap);
                System.out.println();
        }
        System.out.println();
        double maxPriceAp = 0;
        for(Vin_Basic ap : lstAp){
            ap.output();
            System.out.println();

            // Tìm căn hộ nào có giá cao nhất
            if(maxPriceAp < ap.getPrice()){
                maxPriceAp = ap.getPrice();
            }
        }
        System.out.println("Căn hộ nào có giá cao nhất: ");
        for(Vin_Basic ap : lstAp){
            // Cho biết căn hộ nào có giá cao nhất
            if(ap.getPrice() == maxPriceAp){
                ap.output();
            }
        }
    }
}
