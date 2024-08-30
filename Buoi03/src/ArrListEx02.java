import java.util.ArrayList;
import java.util.Scanner;

public class ArrListEx02 {
    public static Scanner sc = new Scanner(System.in);
    private static void inputList(ArrayList<Integer> lst) {
        System.out.print("Nhập vào số phần tử: ");
        int size = sc.nextInt();
        for(int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i+" : ");
            lst.add(sc.nextInt());
        }
    }
    public static void printList(ArrayList<Integer> lst) {
        System.out.println("\nMảng ban đầu");
        for(int x :  lst) {
            System.out.print(x + "    ");
        }
    }
    public static void printListGreaterThanFive(ArrayList<Integer> lst) {
        System.out.println("\nMảng với các số lớn hơn 5!");
        for(int x :  lst) {
            if(x > 5){
                System.out.print(x + "    ");
            }
        }
    }
    public static void sortList(ArrayList<Integer> lst) {
        for (int i = 0; i < lst.size() - 1; i++) {
            for (int j = i + 1; j < lst.size(); j++) {
                if (lst.get(i) > lst.get(j)) {
                    // Hoán đổi vị trí giữa lst.get(i) và lst.get(j)
                    int temp = lst.get(i);
                    lst.set(i, lst.get(j));
                    lst.set(j, temp);
                }
            }
        }
        System.out.println("Mảng sau khi xắp sếp");

        for (Integer integer : lst) {
            System.out.print(integer + "    ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        inputList(lst);
        printList(lst);
        printListGreaterThanFive(lst);
        sortList(lst);

    }
}
