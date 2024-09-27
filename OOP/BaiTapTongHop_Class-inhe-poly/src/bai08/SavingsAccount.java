package bai08;

public class SavingsAccount extends BankAccount {
    // Tạo lớp SavingsAccount kế thừa từ lớp BankAccount và thêm thuộc tính interestRate.
    private double interestRate;
    public SavingsAccount() {}
    public SavingsAccount(int accountNumber,double balance ,double interestRate) {
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }
    public void output(){
        super.output();
        System.out.println("Interest Rate: "+interestRate);
    }
}
