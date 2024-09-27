package bai02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    static Scanner sc = new Scanner(System.in);
    static int n;

    static ArrayList<baitap02> baitaps = new ArrayList<>();
    public static void menu01 () {
        //-Nhập List n sản phẩm
        System.out.print("Nhập số sản phẩm: "); n = sc.nextInt();
        // Nhap n san pham
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sản phẩm "+ (i+1) + " :");
            baitap02 baitap = new baitap02();
            baitap.inputProduct();
            baitaps.add(baitap);
            System.out.println();
        }
        for (baitap02 baitap : baitaps) {
            baitap.calcTotalPrice(baitap.getDonGia(), baitap.getSoLuong());
        }
    }
    public static void menu02 () {
        //-In danh sách n sản phẩm
        int index = 1;
        for (baitap02 baitap : baitaps) {
            System.out.println("Sản phẩm số "+index+" :");
            baitap.outputProduct();
            ++index;
            System.out.println();
        }
    }
    public static void menu03 () {
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

    }
    public static void menu04 () {
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
        System.out.println("Sắp xếp thành công!");
        menu02();

    }



    public static void menu06() {
        // In ra tong tien theo hang san xuat
//        Set<String> uniqueValues = new HashSet<>();
        // thay thế set bằng arrayList
        ArrayList<String> uniqueValues = new ArrayList<>();

        for (baitap02 baitap : baitaps) {
            String hangSx = baitap.getHangSX();


            if (!uniqueValues.contains(hangSx)) {
                uniqueValues.add(hangSx); // Add to the set

                double sumNsx = 0;
                for (baitap02 otherBaitap : baitaps) {
                    if (hangSx.equals(otherBaitap.getHangSX())) {
                        sumNsx += otherBaitap.getThanhTien();
                    }
                }

                System.out.println("Tổng thành tiền của hãng " + hangSx + ": " + sumNsx);
            }
        }
    }
    public static void main(String[] args) {
        // Trong hàm main
        // Thiet ke menu'
        int method = 1;
            System.out.println("Menu lựa chọn công việc!!");
            System.out.println("1. Nhập sản phẩm");
            System.out.println("2. In danh sách sản phẩm");
            System.out.println("3. In danh sách sản phẩm theo khoảng");
            System.out.println("4. Sắp xếp và in ra danh sách theo khoảng thành tiền");
            System.out.println("5. Thoát");
            System.out.println("6. In ra tổng tiền theo hãng sản xuất");

        do {
            System.out.print("Mời lựa chọn công việc: ");
            method = sc.nextInt();
            switch (method) {
                case 1:
                    menu01();
                    break;
                case 2:
                    menu02();
                    break;
                case 3:
                    menu03();
                    break;
                case 4:
                    menu04();
                    break;
                case 6:
                    menu06();
                    break;

            }
        }while (method!=5);
        System.out.println("Bai");
    }
}
