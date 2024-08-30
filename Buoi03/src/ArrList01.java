import java.util.ArrayList;
import java.util.Scanner;

public class ArrList01 {
    public static Scanner sc = new Scanner(System.in);
    private static void inputList(ArrayList<Double> lst) {
        System.out.print("Nhập vào số phần tử: ");
        int size = sc.nextInt();
        for(int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i+" : ");
            lst.add(sc.nextDouble());
        }
    }
    private static double outpuSumtList(ArrayList<Double> lst) {
        double sum = 0.0;
        for(double x: lst) {
            sum += x;
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Double> lst = new ArrayList<>();
        inputList(lst);
        System.out.println("Tổng các phần tử: " + outpuSumtList(lst));
    }
}
