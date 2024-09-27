package bai01;

import java.util.Scanner;

public class QuanLyMuaVe {
    private String tenKhachHang;
    private double giaVe ;
    private int loaiVe;
    private String loaiThe;
    public QuanLyMuaVe() {
        this.tenKhachHang = "";
        this.giaVe = 0.0;
        this.loaiVe = 0;
    }

    public double getGiaVe() {
        return giaVe;
    }
    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }
    public String getLoaiThe() {
        return loaiThe;
    }
    public void setLoaiThe(String loaiThe) {
        this.loaiThe = loaiThe;
    }
    public int getLoaiVe() {
        return loaiVe;
    }
    public void setLoaiVe(int loaiVe) {
        this.loaiVe = loaiVe;
    }

    public QuanLyMuaVe(String tenKhachHang, int loaiVe) {
        this.tenKhachHang = tenKhachHang;
        this.loaiVe = loaiVe;
    }

    public void NhapKhachHang() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên khách hàng: "); tenKhachHang = sc.nextLine();
    }
    public void XuatKhachHang() {
        System.out.println("Tên khách: " + tenKhachHang);
//        if(loaiVe!=1) {
//        }
//        else {
//        }
        System.out.println("Giá vé: "+giaVe);
        System.out.println("Loại thẻ: "+ loaiThe);
    }
}
