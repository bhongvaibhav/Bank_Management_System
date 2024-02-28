package com.Main;

import com.BankAccount.bankAccount;
import com.CheckingAccount.CheckingAccount;
import com.SavingsAccount.SavingsAccount;

public class Main {

	public static void main(String[] args) {

		SavingsAccount savingsAccount = new SavingsAccount("60276241092", "vaibhav", 1000.0, 0.02, 100.0);

		CheckingAccount checkingAccount = new CheckingAccount("9760489246", "diksha", 500.0, 200.0);

		displayAccountInfo(savingsAccount);
		displayAccountInfo(checkingAccount);

		System.out.println("Performing transactions...\n");

		savingsAccount.deposit(500.0);
		System.out.println("Deposited 500 into the savings account.");
		displayAccountInfo(savingsAccount);

		checkingAccount.withdraw(800.0);
		System.out.println("Withdrawn 800 from the checking account.");
		displayAccountInfo(checkingAccount);

		savingsAccount.withdraw(1500.0);
		System.out.println("Attempted to withdraw $1500 from the savings account.");
		displayAccountInfo(savingsAccount);

		checkingAccount.withdraw(300.0);
		System.out.println("Withdrawn 300 from the checking account.");
		displayAccountInfo(checkingAccount);
	}

	private static void displayAccountInfo(bankAccount account) {
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Account Holder Name: " + account.getAccountHolderName());
		System.out.println("Balance: " + account.getBalance());
		System.out.println("-----------------------");
	}
}
