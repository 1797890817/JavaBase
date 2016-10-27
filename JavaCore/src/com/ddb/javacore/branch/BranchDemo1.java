package com.ddb.javacore.branch;

import java.io.PrintStream;

public class BranchDemo1 {

	public static void main(String[] args) {
		PrintStream out = System.out;
		int x = Integer.parseInt( args[0] + "");
		//If demo
		out.println();
		if ( x ==3) { 
			out.println("If demo 1 : x = " + x);
		}
		
		// IF else 
		out.println();
		out.println("If else demo:");
		if (x==5) {
			out.println("If else demo : x = " + x);
		} else {
			out.println("If else demo : x !=5 : " + x);
		}
		
		// If else if else
		out.println();
		out.println("If else if else demo:");
		if (x > 3) {
			out.println("x > 3 case");
		} else if (x == 3) {
			out.println("x = 3 case");
		} else if (x < 3) {
			out.println("x < 3 case ");
		}
		
		//Switch
		out.println();
		out.println("switch demo:");
		switch (x) {
		case 5:
			out.println("X = 5 ;");
			break;
		case 3:
			out.println("X = 3 ;");
			break;
		case 1:
			out.println("X = 1 ;");
			break;
		case 0:
			out.println("X = 0 ;");
			break;
		default:
			out.println("default x = " + x);
			break;
		}
		//? x:y
		out.println();
		out.println("?: demo:");
		int m = (x>3) ? 6:7;
		out.println("m = " + m);
		
	}
}
