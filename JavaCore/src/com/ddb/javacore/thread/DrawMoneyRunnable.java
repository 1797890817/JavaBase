package com.ddb.javacore.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.OverlayLayout;

class DrawMoneyRunnable implements Runnable {
	private final Lock lock = new ReentrantLock();
	private Account account;
	private double drawAmount;

	public DrawMoneyRunnable(Account account, double drawAmount) {
		super();
		this.account = account;
		this.drawAmount = drawAmount;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		if (account.getBalance() >= drawAmount) { // 1
			System.out.println("取钱成功， 取出钱数为：" + drawAmount);
			double balance = account.getBalance() - drawAmount;
			account.setBalance(balance);
			System.out.println("余额为：" + balance);
		}
	}

/*	public synchronized void run() {
		
		System.out.println(Thread.currentThread().getName());
		if (account.getBalance() >= drawAmount) { // 1
			System.out.println("取钱成功， 取出钱数为：" + drawAmount);
			double balance = account.getBalance() - drawAmount;
			account.setBalance(balance);
			System.out.println("余额为：" + balance);
		}
		
	}
	public void run() {
		//public synchronized void run() {
		lock.lock();
		System.out.println(Thread.currentThread().getName());
		if (account.getBalance() >= drawAmount) { // 1
			System.out.println("取钱成功， 取出钱数为：" + drawAmount);
			double balance = account.getBalance() - drawAmount;
			account.setBalance(balance);
			System.out.println("余额为：" + balance);
		}
		lock.unlock();
	}*/
	
	/*public void run() {
		synchronized (account) {
			System.out.println(Thread.currentThread().getName());
			if (account.getBalance() >= drawAmount) { // 1
				System.out.println("取钱成功， 取出钱数为：" + drawAmount);
				double balance = account.getBalance() - drawAmount;
				account.setBalance(balance);
				System.out.println("余额为：" + balance);
			}
		}
	}*/
}
