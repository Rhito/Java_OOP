import java.util.Arrays;
import java.util.Scanner;

public class array_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element "+ i +" : ");
            arr[i] = sc.nextInt();
        }
        mergeSortExcludingNegative(arr);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSortExcludingNegative(int[] arr) {
        // Tách các phần tử không âm và các phần tử âm
        int[] positiveArray = Arrays.stream(arr).filter(x -> x >= 0).toArray();

        // Thực hiện merge sort với mảng không âm
        mergeSort(positiveArray);

        // Kết hợp lại mảng ban đầu
        int positiveIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[i] = positiveArray[positiveIndex++];
            }
        }
    }

    private static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (left[l] < right[r]) {
                arr[i++] = left[l++];
            } else {
                arr[i++] = right[r++];
            }
        }
        while (l < leftSize) {
            arr[i++] = left[l++];
        }
        while (r < rightSize) {
            arr[i++] = right[r++];
        }
    }
}
