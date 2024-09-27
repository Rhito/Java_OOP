package bai04;

public class Main {
    public static void main(String[] args) {
        // Tar: Tạo lớp Rectangle với các thuộc tính length và width. Tạo lớp Square kế
        // thừa từ lớp Rectangle và sử dụng phương thức khởi tạo (constructor) để thiết lập
        // độ dài và độ rộng bằng nhau.
        Square square = new Square(3);
        square.output();
    }
}
