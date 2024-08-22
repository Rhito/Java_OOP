public class tinhtongcontinute {
    public static void main(String[] args) {
        long sum = 0;
        int maxlength = 101;
        for (int i = 0; i <= maxlength; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " + ");
            sum += i;
        }
        System.out.println("0 = " +sum);
    }
}
