package bai08;

public class BankAccount {
    private int accountNumber;
    private double balance;
    public BankAccount() {}
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void output(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
