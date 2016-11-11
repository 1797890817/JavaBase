package com.ddb.javacore.thread;

public class ThreadRunableDemo {

	public static void main(String[] args) {
		Thread myThread = new MyThread(); 
		myThread.setName("MyThread");
		Thread myRunable = new Thread(new MyRunable());
		myRunable.setName("MyRunable");
		
		myThread.start();
		myRunable.start();
		
	}

}
