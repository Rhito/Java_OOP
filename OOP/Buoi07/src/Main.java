import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        KySu ks = new KySu();
//        ks.Nhap();
//        ks.Xuat();

//        NhanVien nv = new NhanVien();
//        nv.Nhap();
//        nv.Xuat();
        int n;
        ArrayList<CanBo> canBos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of canBos in the array: "); n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap canBo thu  " + (i + 1) + ": ");
            System.out.println("Can bo la ky su (1) hay nhan vien (0)?");
            int chosen = sc.nextInt();

            if (chosen == 1) {
                CanBo kx = new KySu();
                kx.Nhap();
                canBos.add(kx);
            }else {
                CanBo nv = new NhanVien();
                nv.Nhap();
                canBos.add(nv);
            }
        }
        System.out.printf("%10s %5s %5s %5s %5s     \n", "maNV", "hoTen", "tuoi", "gioiTinh", "diaChi");
       for(CanBo cb : canBos) {
           cb.Xuat();
       }
        sc.close();
    }
}