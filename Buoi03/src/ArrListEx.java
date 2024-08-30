import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrListEx {
    public static Scanner sc = new Scanner(System.in);
    private static void inputList(ArrayList<String> lst) {
        System.out.print("Nhập vào số câu hỏi: ");
        int size = sc.nextInt();
        for(int i = 0; i < size; i++) {
            System.out.print("Nhập câu hỏi thứ " + i +" : ");
            lst.add(sc.next());
        }
    }
    private static void outputRamdomList(ArrayList<String> list) {
        Random rand = new Random();
        int size = list.size();

        for (int i = 0; i < size; i++) {
            // Chọn một chỉ số ngẫu nhiên
            int randomIndex = rand.nextInt(size);

            // Hoán đổi phần tử hiện tại với phần tử ngẫu nhiên
            String temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        inputList(lst);
        outputRamdomList(lst);
        System.out.println("Các câu hỏi đã tráo ");
        for(String x: lst) {
            System.out.println(x);
        }
    }
}
