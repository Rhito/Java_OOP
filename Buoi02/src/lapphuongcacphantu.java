import java.util.Scanner;

public class lapphuongcacphantu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of numbers:  ");
        int nb = sc.nextInt();
        double[] arr = new double[nb];
        for (int i = 0; i < nb; i++) {
            System.out.print("Enter number " + i + ": ");
            arr[i] = sc.nextDouble();
        }
        for (int i = 0; i < nb; i++) {
            arr[i] = arr[i] * arr[i] * arr[i];
        }
        for (int i = 0; i < nb; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}