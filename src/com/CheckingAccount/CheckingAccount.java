package com.CheckingAccount;

import com.BankAccount.bankAccount;

public class CheckingAccount extends bankAccount{

	    private double overdraftLimit;

	    public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
	        super(accountNumber, accountHolderName, balance);
	        this.overdraftLimit = overdraftLimit;
	    }

	    @Override
	    public String getAccountNumber() {
	        return super.accountNumber;
	    }

	    @Override
	    public String getAccountHolderName() {
	        return super.accountHolderName;
	    }

	    @Override
	    public double getBalance() {
	        return super.balance;
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            super.balance += amount;
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (super.balance - amount >= -overdraftLimit && amount > 0) {
	            super.balance -= amount;
	        } else {
	            System.out.println("Withdrawal failed. Insufficient balance or exceeding overdraft limit.");
	        }
	    }

	    public double getOverdraftLimit() {
	        return overdraftLimit;
	    }

	    public void setOverdraftLimit(double overdraftLimit) {
	        this.overdraftLimit = overdraftLimit;
	    }
	}


