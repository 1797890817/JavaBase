package com.ddb.javacore.ood6;

public class TestSingleton {

	public static void main(String[] args) {
		Singleton singleton1 =Singleton.getInstance();
		Singleton singleton2 =Singleton.getInstance();
		Singleton singleton3 =Singleton.getInstance();
		Singleton singleton4 =Singleton.getInstance();

		System.out.println(singleton1);
		System.out.println(singleton2);
		System.out.println(singleton3);
		System.out.println(singleton4);
		//System.out.println(Singleton.instance);
	}

}
