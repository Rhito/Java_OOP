import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1, n2, n3, n4;
        System.out.println("Nhập số có 4 chữ số: ");
        n = sc.nextInt();
        n1 = n/1000;
        n2 = (n%1000)/100;
        n3 = (n%100)/10;
        n4 = n%10;
        System.out.println(n1+ n2+n3+n4);
    }
}
