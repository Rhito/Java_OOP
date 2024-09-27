package bai10;

import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private double salary;
    public Employee() {}
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee id : ");
        id = sc.nextLine();
        System.out.print("Enter the employee name : ");
        name = sc.nextLine();
        System.out.print("Enter the employee salary : ");
        salary = sc.nextDouble();
    }
    public void output() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

}
