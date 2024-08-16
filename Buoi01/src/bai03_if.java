import java.util.Scanner;

public class bai03_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kw;
        double tiendien = 0;
        System.out.println("Nhập vào số KW điện tiêu thụ:");
         kw = sc.nextInt();
        if(kw >= 1 && kw <= 100) {
            tiendien = kw*550;
        } else if (kw > 100 && kw <= 150) {
            tiendien = 100*550+ (kw-100)*750;
        } else if (kw > 150 && kw <= 200) {
            tiendien = 100*550+50*750 + (kw-150)*950;
        } else if (kw > 200) {
            tiendien = 100*550+50*750+50*950 + (kw-200)*1350;
        }
        System.out.println(tiendien*1.1);
    }
}
