import java.util.Scanner;

public class NhanVien {
    Scanner sc = new Scanner(System.in);
    public int n;
    public int maNhanVien;
    public String hoTen;
    public long heSoluong, luongThucLinh;
    NhanVien[] lstNv;

    // Constructor cho class NhanVien
    public NhanVien() {}

    public NhanVien(int maNhanVien, String hoTen, long heSoluong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.heSoluong = heSoluong;
    }

    public void NhapDuLieu() {
        System.out.print("Nhập số nhân viên: ");
        n = sc.nextInt();
        lstNv = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            System.out.print("Nhập mã nhân viên: ");
            int maNv = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng newline sau khi nhập số
            System.out.print("Nhập họ tên nhân viên: ");
            String hoTenNv = sc.nextLine();
            System.out.print("Nhập hệ số lương: ");
            long heSoLuongNv = sc.nextLong();

            // Khởi tạo từng đối tượng NhanVien và gán vào mảng
            lstNv[i] = new NhanVien(maNv, hoTenNv, heSoLuongNv);
        }
    }

    public void TinhLuong() {
        for (int i = 0; i < n; i++) {
            lstNv[i].luongThucLinh = lstNv[i].heSoluong * 1800000;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Lương thực lĩnh của " + lstNv[i].hoTen +" là: " + lstNv[i].luongThucLinh);
        }
    }

    public void XuatDuLieu() {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhân viên thứ " + (i + 1)+"\n");
            System.out.println("Mã nhân viên: " + lstNv[i].maNhanVien);
            System.out.println("Họ tên: " + lstNv[i].hoTen);
            System.out.println("Hệ số lương: " + lstNv[i].heSoluong);

        }
    }
}
