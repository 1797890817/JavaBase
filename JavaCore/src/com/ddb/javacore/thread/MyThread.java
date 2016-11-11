package com.ddb.javacore.thread;

import java.io.PrintStream;

public class MyThread extends Thread {
	PrintStream out = System.out;

	@Override
	public void run() {
		out.println("当前的线程的名称是：" + Thread.currentThread().getName());
		for (int i = 0; i <= 100; i++) {
			out.println(Thread.currentThread().getName() + "--" + i);
		}
		
	}

}
