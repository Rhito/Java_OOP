import java.util.Scanner;

public class CanBo {
    private String maNV;
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    public CanBo() {}
    public CanBo(String maNV, String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    public String getMaNV() {
        return maNV;
    }
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void Xuat() {
        System.out.printf("%10s %5s %5s %5s %5s     ", maNV, hoTen, tuoi, gioiTinh, diaChi);
    }
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma NV: "); maNV = sc.nextLine();
        System.out.print("Ho Ten: "); hoTen = sc.nextLine();
        System.out.print("Tuoi: "); tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Gioi tinh: "); gioiTinh = sc.nextLine();
        System.out.print("Dia Chi: "); diaChi = sc.nextLine();
    }
}
