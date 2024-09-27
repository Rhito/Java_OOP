package bai01;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        Bài 1. Khu vui chơi bán vé vui chơi với giá vé trọn gói là 250.000đ/ người lớn,
//        130.000đ/ trẻ em trên 1m, và miễn phí cho trẻ em dưới 1m. Khách đến chơi gồm
//        có người lớn và trẻ em.
//        Viết chương trình quản lý thông tin mua vé, gồm các thông tin:
//        - Đối với khách hàng là người lớn: Tên khách hàng, CMND, Giá vé.
//        - Đối với khách hàng là trẻ em: Tên khách hàng, chiều cao, Giá vé.
//          Sau khi mua vé thì khách hàng sẽ được đeo thẻ như sau: Người lớn sẽ mang thẻ đỏ,
//          trẻ em sẽ được mang thẻ xanh.

//          Tính doanh thu của công viên sau một lượt tham quan
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số người tham gia vui chơi: ");
        int n = sc.nextInt();
        double tongDoanhThu = 0;
        ArrayList<QuanLyMuaVe> lstVes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập người tham gia vui chơi thứ " + (i + 1) + ": ");
            System.out.println("Người tham gia: trẻ em -> (1) || người lớn -> (!1) !!");
            int chosen = sc.nextInt();

            QuanLyMuaVe ve;
            if (chosen == 1) ve = new VeTreEm();
            else ve = new VeNguoiLon();

            ve.NhapKhachHang();
            lstVes.add(ve);
        }
        for (QuanLyMuaVe ve : lstVes) {
            ve.XuatKhachHang();
            tongDoanhThu += ve.getGiaVe();
        }
        System.out.println("Tổng doạnh thu của lượt tham quan là: " + tongDoanhThu);
    }
}
