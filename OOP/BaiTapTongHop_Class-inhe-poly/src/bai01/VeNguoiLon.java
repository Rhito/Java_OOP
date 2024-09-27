package bai01;

import java.util.Scanner;

public class VeNguoiLon extends  QuanLyMuaVe{
    private String CMND;
    public VeNguoiLon(){
        super();
        super.setLoaiVe(0);
        super.setGiaVe(250000);
        super.setLoaiThe("Đỏ");
        this.CMND = "";
    }
    public VeNguoiLon(String tenKhachHang, String CMND, int loaiVe){
        super(tenKhachHang,loaiVe);
        this.CMND = CMND;
    }
    public void NhapKhachHang() {
        Scanner sc = new Scanner(System.in);
        super.NhapKhachHang();
        System.out.print("Nhập CMND: "); CMND = sc.nextLine();
        System.out.println();
    }
    public void XuatKhachHang() {
        super.XuatKhachHang();
        System.out.println("Loại vé: Người lớn");
        System.out.println("CMND: "+CMND);
        System.out.println();
    }
}
