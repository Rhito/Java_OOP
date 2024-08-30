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
            System.out.print("Enter the grade of student: ");
            points[i] = sc.nextFloat();
        }
        //  sắp xếp keps

        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (points[i] > points[j]) {
                    float temp = points[j];
                    String tempString = names[j];

                    //Sap xep noi bot mang diem
                    points[j] = points[i];
                    points[i] = temp;

                    //Sap xep noi bot mang ten
                    names[j] = names[i];
                    names[i] = tempString;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.println("Name: " + names[i] + " Grade: " + points[i]);
        }
    }
}
