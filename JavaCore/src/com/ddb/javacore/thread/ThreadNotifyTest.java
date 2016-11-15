package com.ddb.javacore.thread;

public class ThreadNotifyTest {

	public static void main(String[] args) {
		Account account = new Account("123456", 550);
		
		Thread drawMoneyThread = new DrawMoneyThread("取钱线程", account, 700);
		Thread depositeMoneyThread = new DepositeMoneyThread("存钱线程", account, 700);

		drawMoneyThread.start();
		depositeMoneyThread.start();
	}

}