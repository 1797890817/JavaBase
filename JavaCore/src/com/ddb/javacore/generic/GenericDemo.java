package com.ddb.javacore.generic;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		// JDK 1.5之前
		// Collection1里面可存放整数，字符,布尔，字符串...
		ArrayList collection1 = new ArrayList();
		collection1.add(1);
		collection1.add(1L);
		collection1.add(1.5);
		collection1.add("abc");
		collection1.add(true);
		collection1.add('a');
		// int ia = (int) collection1.get(1);//1.8运行报错
		Long long1 = (Long) collection1.get(1);
		int ia = long1.intValue();
		System.out.println("int ia :" + ia);
		System.out.println("collection1.get(1).getClass() :" + collection1.get(1).getClass());
		for (int i = 0; i < collection1.size(); i++) {
			System.out.println(collection1.get(i));
		}
	}

}
