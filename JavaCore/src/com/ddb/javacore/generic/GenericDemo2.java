package com.ddb.javacore.generic;

import java.io.PrintStream;
import java.util.ArrayList;

public class GenericDemo2 {
	public static void main(String[] args) {
		// JDK 1.5之后
		PrintStream out = System.out;
		// 有了<String>之后，定义了在Collection2中只能存放字符串
		ArrayList<String> collection2 = new ArrayList<String>();
		collection2.add("1");
		// collection2.add(1);
		// collection2.add(1L);
		collection2.add("abc");
		String s = collection2.get(1);
		for (String string : collection2) {
			out.println(string);
		}
	}
}
