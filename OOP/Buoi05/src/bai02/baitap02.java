package bai02;

import java.util.Scanner;

public class baitap02 {
//    Bài 2. Xây dựng lớp Sản phẩm gồm
//-Các trường dữ liệu Mã sản phẩm, tên sản phẩm, hãng sản xuất, số lượng, đơn giá.

    private String maSp;
    private String tenSp;
    private String hangSX;
    private int soLuong;
    private double donGia, thanhTien;
    Scanner sc = new Scanner(System.in);

    //-Các thuộc tính tương ứng với các trường dữ liệu
    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMaSp() {
        return maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public String getHangSX() {
        return hangSX;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }
    public double getThanhTien() {
        return thanhTien;
    }


    //-Hàm tạo có tham số và hàm tạo không có tham số
    public baitap02() {
        this.maSp = null;
        this.tenSp = null;
        this.hangSX = null;
        this.soLuong = 0;
        this.donGia = 0;
    }

    public baitap02(String maSp, String tenSp, String hangSX, int soLuong, double donGia) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.hangSX = hangSX;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    //-Các phương thức: nhập, xuất
    public void inputProduct() {
        System.out.print("Nhập mã sản phẩm: ");
        this.maSp = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        this.tenSp = sc.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        this.hangSX = sc.nextLine();
        System.out.print("Nhập số lượng: ");
        this.soLuong = sc.nextInt();
        System.out.print("Nhập đơn giá: ");
        this.donGia = sc.nextDouble();
    }

    public void outputProduct() {
        System.out.println("Mã sản phẩm: " + this.maSp);
        System.out.println("Tên sản phẩm: " + this.tenSp);
        System.out.println("Hãng sản xuất: " + this.hangSX);
        System.out.println("Số lượng: " + this.soLuong);
        System.out.println("Đơn giá: " + this.donGia);
        System.out.println("Thành tiền: " + this.calcTotalPrice(this.donGia, this.soLuong));
    }

    //-Phương thức tính thành tiền = số lượng * đơn giá
    public double calcTotalPrice(double donGia, int soLuong) {
        return thanhTien = soLuong * donGia;
    }

}

