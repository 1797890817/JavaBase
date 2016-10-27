package com.ddb.javacore.arrary;

import java.io.PrintStream;

public class ArrayDemo2 {

	public static void main(String[] args) {
		PrintStream out = System.out;
		int[] intArrary = {00,11,22,33,44,55} ;// 声明一个int类型的数组
		int j= 0;
		for (int i : intArrary) {
			++j;
			out.println("intArrary " +j + " = " + i);
			//j++;
		}
		
		out.println();
		int m= intArrary.length;
		for (int i : intArrary) {
			out.println("intArrary " +m + " = " + i);
			m--;
		}
		out.println();
		out.println("intArrary --");
		int L = intArrary.length;
		for (int i = L-1; i >=0 ; i--) {
			out.println("intArrary " +i + " = " + intArrary[i]);
			
		}
		
		//二维数组
		out.println();
		out.println("towArrary Demo");
		int[][] towArrary = { { 9, 3 }, { 5, 4, 0, 5 }, { 9, 1, 2 } };
	    System.out.println(towArrary[0][1]);
	    System.out.println(towArrary[1][2]);
	    towArrary[1][3]=7;
	    System.out.println(towArrary[1][3]);
		
	}

}
