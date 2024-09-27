package bai08;

public class Main {
    // Tạo lớp BankAccount với các thuộc tính accountNumber và balance.
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(22109335,500000,1.5);
        savingsAccount.output();
    }
}
