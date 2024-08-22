import java.util.Scanner;

public class arrdiemhoten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        float[] points = new float[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter the name of student: ");
            names[i] = sc.next();
            System.out.print("Enter the student's grade: ");
            points[i] = sc.nextFloat();
        }
        //  sắp xếp mảng điểm
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (points[i] > points[j]) {
                    float temp = points[j];
                    points[j] = points[i];
                    points[i] = temp;
                }
            }
            for (int j = i+1; j < n; j++) {
                if (points[j] > points[i]) {
                    String temp = names[j];
                    names[j] = names[i];
                    names[i] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.println("Name: " + names[i] + " Grade: " + points[i]);
        }
    }
}
