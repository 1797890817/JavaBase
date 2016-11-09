package com.ddb.javacore.generic;

public class Double2Integer {

	public static void main(String[] args) {
		Double double1 = 5.0;
		Double double2 = 5.4;
		Double double3 = 5.6;
		Integer integer = double1.intValue();
		Integer integer2 = double2.intValue();
		Integer integer3 = double3.intValue();
		System.out.println("double1 :" +double1);
		System.out.println("double2 :" +double2);
		System.out.println("double3 :" +double3);
		System.out.println("integer :" +integer);
		System.out.println("integer2 :" +integer2);
		System.out.println("integer3 :" +integer3);
		
	}

}
