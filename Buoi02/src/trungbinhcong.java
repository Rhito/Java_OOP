import java.util.Scanner;

public class trungbinhcong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of numbers:  ");
        int nb = sc.nextInt();
        double[] arr = new double[nb];
        double sum = 0;
        for (int i = 0; i < nb; i++) {
            System.out.print("Enter number " + i + ": ");
            arr[i] = sc.nextDouble();
        }
    }
}
