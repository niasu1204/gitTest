package com.test02;

public class Account {

	private String account;
	private int balance;
	private double interestRate;
	
	Account() {}

	Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}
	public double calculateInterest() {
		return balance * (interestRate * 0.01);
	}
	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		balance -= money;
	}
	
	
}
