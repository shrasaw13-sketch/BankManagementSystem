package com.bank;

import java.util.ArrayList;

public class Bank {


	    ArrayList<BankAccount> accounts = new ArrayList<>();

	    public void addAccount(BankAccount account) {
	        accounts.add(account);
	    }

	    public BankAccount findAccount(int accountNumber) {

	        for(BankAccount acc : accounts) {

	            if(acc.getAccountNumber() == accountNumber) {
	                return acc;
	            }
	        }
	        return null;
	    }

	    public void displayAllAccounts() {

	        for(BankAccount acc : accounts) {
	            acc.displayAccount();
	            System.out.println("-------------------");
	        }
	    }
	}

