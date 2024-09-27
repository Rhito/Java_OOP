package bai06;

public class Main {
    public static void main(String[] args) {
       // Tạo lớp Shape với phương thức area(). Tạo hai lớp kế thừa từ lớp Shape:
       // lớp Circle và lớp Triangle. Ghi đè phương thức area() trong cả hai lớp kế thừa.
        Circle cr = new Circle();
        cr.Area();
        Triangle tr = new Triangle();
        tr.Area();
    }
}
