package bai09;

public class Main {
    // Tạo lớp Publication với các thuộc tính title và price. Tạo lớp Book và lớp
    // Magazine kế thừa từ lớp Publication. Thêm thuộc tính author vào lớp Book và
    // thuộc tính issue vào lớp Magazine.
    public static void main(String[] args) {
        Book book = new Book("Kẻ điên bên trái thiên tài bên phải", 240000,"Cao Minh");
        book.output();

        System.out.println();

        Magazine magazine = new Magazine("Tạp chí thời vụ", 50000, "Vấn nạn xã hội");
        magazine.output();
    }
}
