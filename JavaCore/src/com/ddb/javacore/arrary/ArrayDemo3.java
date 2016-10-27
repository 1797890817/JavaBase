package com.ddb.javacore.arrary;

import java.io.PrintStream;
import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		PrintStream out = System.out;
		int[] intArrary = { 00, 77, 22, 99, 44, 55 };// 声明一个int类型的数组
		int[] intArray = new int[3];

		// Copy Array
		System.arraycopy(intArrary, 2, intArray, 0, 2);
		out.println("copy array  demo:");
		for (int i : intArray) {
			out.println(i);
		}
		out.println("***************************************");
		/*
		 * System.arraycopy(intArrary, 1, intArray, 0, 3);
		 * out.println("copy array  demo:"); for (int i : intArray) {
		 * out.println(i); }
		 */

		out.println("Arrays sort demo:");
		Arrays.sort(intArrary);
		for (int i : intArrary) {
			out.println(i);
		}
	}
}
