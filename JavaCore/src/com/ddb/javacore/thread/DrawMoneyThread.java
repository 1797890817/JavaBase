package com.ddb.javacore.thread;

class DrawMoneyThread extends Thread {

	private Account account;
	private double amount;

	public DrawMoneyThread(String threadName, Account account, double amount) {
		super(threadName);
		this.account = account;
		this.amount = amount;
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			account.draw(amount, i);
		}
	}
}