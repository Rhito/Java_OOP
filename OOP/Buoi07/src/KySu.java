import javax.swing.*;
import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao;
    public KySu() {}
    public KySu(String maNV, String hoTen, int tuoi, String gioiTinh, String diaChi,String nganhDaoTao) {
        super(maNV, hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }
    public String getNganhDaoTao() {
        return nganhDaoTao;
    }
    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("nganhDaoTao: "); nganhDaoTao = sc.nextLine();
    }
    public void Xuat() {
        super.Xuat();
        System.out.print( nganhDaoTao+ "\n");
    }
}
