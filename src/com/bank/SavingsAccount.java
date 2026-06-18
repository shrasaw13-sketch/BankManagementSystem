package com.bank;

class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber,
                          String customerName,
                          double balance) {
        super(accountNumber, customerName, balance);
    }

    @Override
    public void withdraw(double amount) {

        if(balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
}
