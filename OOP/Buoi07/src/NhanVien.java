import java.util.Scanner;

import java.util.Scanner;

public class NhanVien extends CanBo {

        private String congViec;
        public NhanVien() {}
        public NhanVien(String maNV, String hoTen, int tuoi, String gioiTinh, String diaChi,String congViec) {
            super(maNV, hoTen, tuoi, gioiTinh, diaChi);
            this.congViec = congViec;
        }
        public String getNganhDaoTao() {
            return congViec;
        }
        public void setNganhDaoTao(String congViec) {
            this.congViec = congViec;
        }
        public void Nhap() {
            super.Nhap();
            Scanner sc = new Scanner(System.in);
            System.out.print("CongViec: "); congViec = sc.nextLine();
        }
        public void Xuat() {
            super.Xuat();
            System.out.print(congViec+ "\n");
        }
}
