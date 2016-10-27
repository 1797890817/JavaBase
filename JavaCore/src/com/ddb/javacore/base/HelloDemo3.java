package com.ddb.javacore.base;

public class HelloDemo3 {
	public static void main(String[] args) {
		args[0] = "123";
		args[1] = "456";
		System.out.println("Hello World!");
		System.out.println("我是谁，我的名字是：" + args[0] + "我的年龄是：" + args[1]);
		System.out.println(args[2]);

	}
}
