package bai02;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Trong hàm main
        Scanner sc = new Scanner(System.in);
        int n;
        ArrayList<baitap02> baitaps = new ArrayList<>();
        System.out.print("Nhập số sản phẩm: "); n = sc.nextInt();

        //-Nhập List n sản phẩm
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sản phẩm "+ (i+1) + " :");
            baitap02 baitap = new baitap02();
            baitap.inputProduct();
            baitaps.add(baitap);
            System.out.println();
        }
        //-In danh sách n sản phẩm
        int index = 1;
        for (baitap02 baitap : baitaps) {
            System.out.println("Sản phẩm số "+index+" :");
            baitap.outputProduct();
            ++index;
            System.out.println();
        }
        //-Tìm ra các sản phẩm có thành tiền nằm trong khoảng
        double minVal, maxVal;
        System.out.print("Nhập giá trị thành tiền nhỏ nhất: "); minVal = sc.nextDouble();
        System.out.print("Nhập giá trị thành tiền lớn nhất: "); maxVal = sc.nextDouble();
        System.out.println();

        for (baitap02 baitap : baitaps) {
             if(baitap.getThanhTien() >= minVal && baitap.getThanhTien() <= maxVal) {
                 System.out.println("Sản phẩm số "+ (baitaps.indexOf(baitap)+1)+" :");
                 baitap.outputProduct();
                 System.out.println();
             }
        }
        // -Sắp xếp danh sách theo chiều tăng dần của thành tiền
        for (int i = 0; i < baitaps.size() - 1; i++) {
            for (int j = i + 1; j < baitaps.size(); j++) {
                if (baitaps.get(i).getThanhTien() > baitaps.get(j).getThanhTien()) {
                    // Hoán đổi vị trí giữa baitaps.get(i) và baitaps.get(j)
                    baitap02 temp = baitaps.get(i);
                    baitaps.set(i, baitaps.get(j));
                    baitaps.set(j, temp);
                }
            }
        }
    }
}
