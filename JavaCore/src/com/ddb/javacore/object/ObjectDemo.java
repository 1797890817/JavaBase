package com.ddb.javacore.object;

public class ObjectDemo implements Cloneable {
	
	
	public static void main(String[] args) {
		System.out.println("ObjectDemo.class :" + ObjectDemo.class);
		ObjectDemo demo = new ObjectDemo();
		System.out.println("demo : " + demo);
		System.out.println("demo.getClass() : " + demo.getClass());
		System.out.println("demo.getClass() : " + demo.getClass());
		System.out.println("demo.getClass().getName() : " + demo.getClass().getName());
		//ObjectDemo demo2 = demo2.clone();
		

	}

}
