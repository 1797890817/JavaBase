package com.ddb.javacore.exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		int v1 = Integer.parseInt(args[0]);
		int v2 = Integer.parseInt(args[1]);
		int v3 = v1/v2;
		System.out.println("v3 = "+ v3);
	}

}
