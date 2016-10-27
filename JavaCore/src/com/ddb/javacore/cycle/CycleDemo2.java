package com.ddb.javacore.cycle;

import java.io.PrintStream;

public class CycleDemo2 {

	public static void main(String[] args) {
		PrintStream out = System.out;
		out.println("For 循环：");
		for (int i = 0; i < 5; i++) {
			out.println("i = " + i);
		}

		out.println();
		out.println("For 循环：1+...100 = ");
		int all = 0;
		for (int i = 1; i <= 100; i++) {
			// out.println("i = " + i);
			if (i == 15) {
				out.println("i == 15 ,so continue!");
				continue;
			}
			
			if (i == 80) {
				out.println("i == 80 ,so break!");
				//break;
				return;
			}
			all = all + i;
		}
		out.println("all =  " + all);

		// while
		int x = 4;
		int y = 0;
		out.println();
		out.println("While Demo: ");
		while (y <= x) {
			out.println("y = " + y);
			y++;
			out.println("y = " + y);

		}

		// do while
		int m = 3;
		out.println();
		out.println("do while demo: ");
		do {
			out.println("m = " + m);
			m--;
			out.println("m = " + m);
		} while (m >= -1);

		out.println("do while demo: ");
		do {
			out.println("m = " + m);
			m--;
			out.println("m = " + m);
		} while (m == -1);

		// foreach
		out.println();
		out.println("foreach demo: ");
		int[] arry = { 11, 22, 33, 44, 55, 66 };
		for (int i : arry) {
			out.println("i = " + i);
		}

		out.println();
		out.println("foreach demo: ");
		for (int i = 0; i < arry.length; i++) {
			out.println("i = " + arry[i]);
			// out.println("= = " + arry[arry.length]);

		}
		
		//9*9口诀
		out.println();
		out.println("9*9口诀: ");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				out.print(j+ "*"+ i +"= " + i * j + "\t");
			}
			out.println(); 
		}
		
		out.println("For muti-v demo: ");
		for (int i = 1,j=1; (i <= 9)&&(j<=i); i++,j++) {
			out.print(j+ "*"+ i +"= " + i * j + "\t");
		}
		out.println(); 
		
		
	}

}
