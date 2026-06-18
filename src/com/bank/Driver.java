package com.bank;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while(true) {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice) {

            case 1:

                System.out.print("Account Number: ");
                int accNo = sc.nextInt();

                sc.nextLine();

                System.out.print("Customer Name: ");
                String name = sc.nextLine();

                System.out.print("Initial Balance: ");
                double balance = sc.nextDouble();

                BankAccount account =
                    new SavingsAccount(accNo, name, balance);

                bank.addAccount(account);

                System.out.println("Account Created");
                break;

            case 2:

                System.out.print("Account Number: ");
                accNo = sc.nextInt();

                BankAccount depAcc =
                    bank.findAccount(accNo);

                if(depAcc != null) {

                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();

                    depAcc.deposit(amt);
                }
                else {
                    System.out.println("Account Not Found");
                }

                break;

            case 3:

                System.out.print("Account Number: ");
                accNo = sc.nextInt();

                BankAccount withAcc =
                    bank.findAccount(accNo);

                if(withAcc != null) {

                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();

                    withAcc.withdraw(amt);
                }
                else {
                    System.out.println("Account Not Found");
                }

                break;

            case 4:
                bank.displayAllAccounts();
                break;

            case 5:
                System.out.println("Thank You");
                System.exit(0);

            default:
                System.out.println("Invalid Choice");
            }
        }
    }
}
