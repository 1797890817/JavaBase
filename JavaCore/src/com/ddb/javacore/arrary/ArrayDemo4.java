package com.ddb.javacore.arrary;

import java.io.PrintStream;
import java.util.Arrays;

public class ArrayDemo4 {
	
	public static String[] getArray() {
		String[] strArray = {"AA","BB","CC"};
		
		return strArray;
	}

	public static void main(String[] args) {
		PrintStream out = System.out;
		String[] tmp = ArrayDemo4.getArray();
		for (String string : tmp) {
			out.println(string);
		}
	}
}
