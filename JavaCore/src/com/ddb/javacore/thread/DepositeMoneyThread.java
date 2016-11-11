package com.ddb.javacore.thread;

class DepositeMoneyThread extends Thread {

	private Account account;
	private double amount;

	public DepositeMoneyThread(String threadName, Account account, double amount) {
		super(threadName);
		this.account = account;
		this.amount = amount;
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			account.deposite(amount, i);
		}
	}
}