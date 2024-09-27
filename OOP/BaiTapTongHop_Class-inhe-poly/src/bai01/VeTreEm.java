package bai01;

import java.util.Scanner;

public class VeTreEm  extends  QuanLyMuaVe{
        private double chieuCao;
        public VeTreEm(){
            super();
            super.setLoaiVe(1);
            super.setGiaVe(130000);
            super.setLoaiThe("Xanh");
        }
        public VeTreEm(String tenKhachHang, double chieuCao, int loaiVe){
            super(tenKhachHang,loaiVe);
            this.chieuCao = chieuCao;
        }
        public void NhapKhachHang() {
            Scanner sc = new Scanner(System.in);
            super.NhapKhachHang();

            System.out.print("Nhập chiều cao: "); chieuCao = sc.nextDouble();
            System.out.println();
        }
        public void XuatKhachHang() {
            super.XuatKhachHang();
            System.out.println("Loại vé: Trẻ em");
            System.out.println("chieuCao: "+chieuCao+"m");
            System.out.println();
        }
    }
