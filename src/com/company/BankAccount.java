package com.company;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    void deposit(double amount) {
        if(amount > 5000) {
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: " + amount);
            return;}
        balance = balance + amount;
    }
    void withdraw (double amount) {
        if(amount>=balance) {
            System.out.println("There is not enough funds");
            return;
        }
        balance = balance - amount;
    }
    void printBalance() {
        System.out.println("Your balance is " + balance);
    }
    void transferFrom(BankAccount oldBankAccount, double amount) {
        if (oldBankAccount.balance < amount) {
            System.out.printf("Transfer canceled. You are trying to transfer %.2f units," +
                    " but only %.2f are available.\n",amount,oldBankAccount.balance);
            return;
        }
        this.balance = this.balance + amount;
        oldBankAccount.balance = oldBankAccount.balance - amount;
    }

    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount(4000);
        ac1.deposit(5001);
        ac1.withdraw(4500);

        BankAccount ac2 = new BankAccount(200);
        ac2.transferFrom(ac1,6000);
        ac1.printBalance();
        ac2.printBalance();

    }


}


