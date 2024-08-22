import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element "+ i +" : ");
            arr[i] = sc.nextInt();
        }
       for (int i = 0; i < size-1; i++) {
               for (int j = i+1; j < size; j++) {
                 if(arr[j]<arr[i] && arr[j]>=0) {
                     int temp = arr[j];
                     arr[j] = arr[i];
                     arr[i] = temp;
                 }
               }

       }

       for (int i = 0; i < size; i++) {
           System.out.print(arr[i]+" ");
       }
    }
}
