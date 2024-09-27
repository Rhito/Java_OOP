package Bai07;

public class Main {
    public static void main(String[] args) {
        // Tạo lớp Vehicle với các thuộc tính brand và speed. Tạo lớp Car và lớp Bike
        // kế thừa từ lớp Vehicle. Thêm thuộc tính numOfWheels vào lớp Car và lớp Bike.
        Car car = new Car("Ford",300,4);
        car.output();
        Bike bike = new Bike("Lazeke",25,2);
        bike.output();

    }
}
