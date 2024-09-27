package bai10;

import java.util.Scanner;

public class Main {
    // Tạo lớp Employee với các thuộc tính name, id và salary. Tạo lớp Manager
    // kế thừa từ lớp Employee và thêm thuộc tính subordinates
    // (một danh sách các đối tượng Employee).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Employees : "); int n = sc.nextInt();
        Employee[] emps = new Employee[n];
        int ch;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the subordinates : ");
            System.out.println("Chose 1 if your are Manerger or any number if you are Employee: ");
            ch = sc.nextInt();
            Employee emp;
            if (ch == 1) {
                emp = new Manager();
            }else {
                emp = new Employee();
            }
            emps[i] = emp;
            emp.input();
        }
        for (int i = 0; i < n; i++) {
            emps[i].output();
        }
    }
}
