package bai10;

import java.util.Scanner;

public class Manager extends Employee{
    private String subordinates;
    public Manager(){}
    public Manager(String id, String name, double salary, String subordinates) {
        super(id, name, salary);
        this.subordinates = subordinates;
    }
    public String getSubordinates() {
        return subordinates;
    }
    public void setSubordinates(String subordinates) {
        this.subordinates = subordinates;
    }
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Enter the Subordinates: "); subordinates = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Subordinates: " + this.subordinates);
    }
}
