package com.ddb.javacore.datatype;

import java.io.PrintStream;

public class DataTypeDemo {
	public static void main(String[] args) {
		PrintStream prt = System.out;
		// int demo
		// 声明变量
		int x, y;
		x = 9;
		y = 5;
		prt.println("int demo:");
		prt.println("x + y = " + (x + y) + ";");
		prt.println("x - y = " + (x - y) + ";");
		prt.println("x * y = " + (x * y) + ";");
		prt.println("x / y = " + (x / y) + ";");
		prt.println("x % y = " + (x % y) + ";");

		// char
		prt.println();
		prt.println("char demo:");
		char m, n = 'c';
		m = 'a';
		prt.println("m + n = " + (m + n) + ";");
		prt.println("m = " + m + ";");
		prt.println("n = " + n + ";");

		// float
		float i, j = (float) 3.0;
		i = 6;
		prt.println("float demo :");
		prt.println("i + j =" + (i + j) + ";");

		// boolean
		prt.println();
		prt.println("boolean demo :");
		boolean a, b;
		a = true;
		b = false;
		prt.println("a =" + a + ";");
		prt.println("b =" + b + ";");
		prt.println("a&&b =" + (a && b) + ";");
		prt.println("a||b =" + (a || b) + ";");
		prt.println("!a =" + (!a) + ";");
		prt.println("!a =" + !a + ";");

		// String
		prt.println();
		prt.println("String demo :");
		String c, d = "Hello World!";
		c = "I love ";
		prt.println("c + d : " + c + d);
		prt.println("m + n = " + String.valueOf(m) + String.valueOf(n));
	}
}
