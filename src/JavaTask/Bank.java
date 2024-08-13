package JavaTask;

import java.util.Scanner;

public class Bank {

    private String accountNumber;
    private double balance;
//Getter & Setter:
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
//    Constructor:
    public Bank (String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
//    Main Method:
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The AccountNumber: ");
        String st = scanner.next();
        System.out.println("Enter The Balance:  ");
        double tu = scanner.nextDouble();
        Bank person= new Bank(st,tu);
        System.out.println(person.getAccountNumber());
        System.out.println(person.getBalance());
        person.deposit(5000);
        person.withdraw(2000);
    }
}
