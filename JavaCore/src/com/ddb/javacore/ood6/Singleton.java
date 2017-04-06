package com.ddb.javacore.ood6;

public class Singleton {
	// 3.用来存储当前类的一个实例、对象
	//private static Singleton instance = null;	//懒汉式
	private static Singleton instance = new Singleton();	//饿汉式

	// 1.私有化构造方法
	private Singleton() {
		System.out.println("构造函数被执行....");
	}

	// 2.提供外部可以得到的对象实例的方法
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
