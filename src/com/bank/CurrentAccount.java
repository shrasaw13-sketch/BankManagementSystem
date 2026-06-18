package com.bank;

class CurrentAccount extends BankAccount {

    public CurrentAccount(int accountNumber,
                          String customerName,
                          double balance) {
        super(accountNumber, customerName, balance);
    }

    @Override
    public void withdraw(double amount) {

        if(balance + 5000 >= amount) {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
        else {
            System.out.println("Overdraft Limit Exceeded");
        }
    }
}
