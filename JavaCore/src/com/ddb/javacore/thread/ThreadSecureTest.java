package com.ddb.javacore.thread;

public class ThreadSecureTest {

	public static void main(String[] args) {
		Account account = new Account("123456", 2000);
		DrawMoneyRunnable drawMoneyRunnable = new DrawMoneyRunnable(account, 700);
		Thread myThread1 = new Thread(drawMoneyRunnable);
		Thread myThread2 = new Thread(drawMoneyRunnable);
		Thread myThread3 = new Thread(drawMoneyRunnable);
		Thread myThread4 = new Thread(drawMoneyRunnable);
		Thread myThread5 = new Thread(drawMoneyRunnable);
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		myThread5.start();
	}

}
