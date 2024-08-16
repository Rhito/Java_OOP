import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
        int a,b;
        System.out.println("Enter an integer a:");
        a = sc.nextInt();
        System.out.println("Enter an integer b:");
        b = sc.nextInt();
        System.out.println("a%b= " +(a%b));

    }
}