package com.ddb.javacore.arrary;

import java.io.PrintStream;

public class ArrayDemo {

	public static void main(String[] args) {
		PrintStream out = System.out;
		int[] intArrary;// 声明一个int类型的数组

		char[] charArrary;
		String[] strArrary;

		// 数组内存开辟
		int n = 5;
		intArrary = new int[n];
		out.println("Check int Arrary default values:");
		for (int i : intArrary) {
			out.println(i);
		}
		charArrary = new char[10];
		out.println("Check char Arrary default values:");
		for (char i : charArrary) {
			out.println(i);
			out.println(i);
		}

		strArrary = new String[5];
		out.println("Check String Arrary default values:");
		for (String string : strArrary) {
			out.println(string);
		}
		// 数组初始化
		intArrary[0] = 10;
		intArrary[1] = 11;
		intArrary[2] = 22;
		out.println("int 初始化 输出： ");
		for (int i : intArrary) {
			out.println(i);
		}

		charArrary[0] = 'a';
		// charArrary[1]='b';
		charArrary[2] = 'c';
		charArrary[3] = '\t';
		charArrary[4] = 'A';
		charArrary[5] = '\n';
		for (char i : charArrary) {
			out.println(i);
		}

		out.println("String 初始化 输出： ");
		strArrary[0] = "AA";
		strArrary[1] = "BB";
		strArrary[2] = "CC";
		strArrary[3] = "DD";
		// strArrary[5]="FF";
		for (String string : strArrary) {
			out.println(string);
		}

	}

}
