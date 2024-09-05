import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private int diem;
    Scanner sc = new Scanner(System.in);
    public void setHoTen(String hoTen) {
        if(hoTen.length()>50){

            this.hoTen = hoTen.substring(0,49);
        }else {
            this.hoTen = hoTen;
        }
    }
    public void setDiem(int diem) {
       if(diem<0){
           this.diem = 0;
       }
       else if(diem>10){
           this.diem = 10;
       }else
       this.diem = diem;

    }
    public String getHoTen() {
        return hoTen;
    }
   public int getDiem() {
        return diem;
   }
   public void inputSV(){
        System.out.print("Nhập họ tên: "); hoTen = sc.nextLine();
        System.out.print("Nhập điểm: "); diem = sc.nextInt();
   }
   public void outputSV() {
       System.out.println("Họ Tên: "+ hoTen);
       System.out.println("Điểm: "+ diem);
   }
}
