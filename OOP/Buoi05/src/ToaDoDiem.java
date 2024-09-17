import java.util.Scanner;

public class ToaDoDiem {
    //Trường dữ liệu hoành độ và tung độ
    private double tungDo;
    private double hoanhDo;
    private double khoangCachToiGoc;
    private double khoangCachGiua2diem;
    // Thuộc tính hoành độ, tung độ
    public double setTungDo(double tungDo) {
        return this.tungDo = tungDo;
    }
    public double setHoanhDo(double hoanhDo) {
        return this.hoanhDo = hoanhDo;
    }
    public double getTungDo() {
        return this.tungDo;
    }
    public double getHoanhDo() {
        return this.hoanhDo;
    }

    // Hàm tạo có tham số và hàm tạo không có tham số
    public ToaDoDiem() {
        tungDo = 0;
        hoanhDo = 0;
    }

    public ToaDoDiem(double tungDo, double hoanhDo) {
        this.tungDo = tungDo;
        this.hoanhDo = hoanhDo;
    }
    // Phương thức nhập dữ liệu
    public void inputToaDo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hoanh do: "); this.hoanhDo = sc.nextDouble();
        System.out.print("Nhap tung do: ");  this.tungDo = sc.nextDouble();
    }
    // Hàm tính khoảng cách từ điểm đến gốc tọa độ
    public double khoangCachDenGoc() {
      return this.khoangCachToiGoc =  Math.sqrt(this.hoanhDo * this.hoanhDo + this.tungDo * this.tungDo);

    }
    // Hàm tính khoảng cách giữa hai điểm
    public void khoangCachHaiDiem(ToaDoDiem diemKhac) {
        khoangCachGiua2diem = Math.sqrt((this.hoanhDo - diemKhac.hoanhDo) * (this.hoanhDo - diemKhac.hoanhDo)
                + (this.tungDo - diemKhac.tungDo) * (this.tungDo - diemKhac.tungDo));
        System.out.println("Khoang giua 2 diem: " + this.khoangCachGiua2diem);
    }
    // Hàm xuất thông tin bao gồm hoành độ, tung độ, khoảng cách đến gốc tọa độ
    public void outputToaDo() {
//        System.out.println("Hoanh do: " + this.hoanhDo);
//        System.out.println("Tung do: " + this.tungDo);
//        System.out.println("Khoang cach den goc toa do: " + this.khoangCachToiGoc);
        System.out.printf("%20.2f%20.2f%20.2f\n", this.hoanhDo, this.tungDo, this.khoangCachToiGoc);
    }

}
