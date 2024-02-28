package com.SavingsAccount;

import com.BankAccount.bankAccount;

public class SavingsAccount extends bankAccount {

	
	    private double interestRate;
	    private double minimumBalance;

	    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate, double minimumBalance) {
	        super(accountNumber, accountHolderName, balance);
	        this.interestRate = interestRate;
	        this.minimumBalance = minimumBalance;
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
	        if (super.balance - amount >= minimumBalance && amount > 0) {
	            super.balance -= amount;
	        } else {
	            System.out.println("Withdrawal failed. Insufficient balance.");
	        }
	    }

	    public double getInterestRate() {
	        return interestRate;
	    }

	    public void setInterestRate(double interestRate) {
	        this.interestRate = interestRate;
	    }
	}


