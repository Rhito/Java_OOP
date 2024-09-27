package bai05;

public class Main {
    public static void main(String[] args) {
       // Tạo lớp Person với các thuộc tính name và age.
       // Sau đó, tạo lớp Student kế thừa từ lớp Person và thêm thuộc tính course.
        Student s1 = new Student("Long", 23, "JS");
        s1.output();
    }
}
