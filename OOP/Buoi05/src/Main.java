import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToaDoDiem[] point;
        double sum = 0;
//      Nhập vào n điểm
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        point = new ToaDoDiem[number];
        for (int i = 0; i < point.length; i++) {
            System.out.print("Enter tung do: " + i + " : ");
            double x = sc.nextDouble();
            System.out.print("Enter hoanh do: " + i + " : ");
            double y = sc.nextDouble();

            point[i] = new ToaDoDiem(x, y);
        }
//      In ra n điểm
        for(int i = 0; i < point.length; i++) {
            point[i].outputToaDo();
        }
//      Tính  tổng khoảng cách của các điểm đó đến gốc tọa độ
        for (int i = 0; i < point.length; i++) {
            sum += point[i].khoangCachDenGoc();
        }
        System.out.println("Tổng khoảng cách tới gốc là: " + sum);
//      In ra các điểm gần gốc tọa độ nhất
        System.out.println("Các điểm gần gốc nhất là: " + sum);
        double min = point[0].khoangCachDenGoc();
        for (int i = 0; i < point.length-1; i++) {
            if(min > point[i+1].khoangCachDenGoc()) {
                min = point[i+1].khoangCachDenGoc();
            }
        }
        for (ToaDoDiem toaDoDiem : point) {
            if (toaDoDiem.khoangCachDenGoc() == min) {
                toaDoDiem.outputToaDo();
            }
        }
    }
}