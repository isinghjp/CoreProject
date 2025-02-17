package day08;

public class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccount(){
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance : "+balance);
    }

    public static void main(String[] args) {

        BankAccount acc1=new BankAccount("Jay",123456789, 50000.0);
        acc1.displayAccount();
    }

}
