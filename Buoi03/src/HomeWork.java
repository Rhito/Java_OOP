import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork {
    static int n;
    static boolean[] flag = new boolean[100];
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void printArr() {
        for(int x : arr) {
            System.out.print(x);
        }
        System.out.println();
    }
// thuat toan quay lui - backtrack
    public static void hoanVi(int i) {
        // Duyệt các khả năng mà arr[i] có thể nhận được
        for (int j = 1; j <= n; j++) {
            // Xét xem liệu arr[i] == j hay không
            if (!flag[j]) {
                if (arr.size() >= i) {
                    arr.set(i - 1, j);
                } else {
                    arr.add(j);
                }
                flag[j] = true; // Đánh dấu số j đã được sử dụng

                if (i == n) {
                    printArr(); // In hoán vị hiện tại khi đã điền đủ các phần tử
                } else {
                    hoanVi(i + 1); // Gọi đệ quy để tiếp tục điền phần tử tiếp theo
                }

                // Backtrack: bỏ chọn số j để có thể sử dụng lại cho các hoán vị khác
                flag[j] = false;
            }
        }
        if (arr.size() > i - 1) {
            arr.remove(i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số câu hỏi: ");
        n = sc.nextInt();

        long factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Tổng số cách sắp xếp các câu hỏi là: " + factorial);

        hoanVi(1);
    }
}
