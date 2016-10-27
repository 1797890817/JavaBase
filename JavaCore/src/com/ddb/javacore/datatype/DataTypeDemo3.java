package com.ddb.javacore.datatype;

import java.io.PrintStream;

public class DataTypeDemo3 {
	public static void main(String[] args) {
		PrintStream prt = System.out;
		// byte demo
		// 声明变量
		Byte byte1 = 16;
		Byte byte2 = 16;
		prt.println("byte1 + byte2:" + (byte1 + byte2));

		Short short1 = 200;
		Short short2 = 210;
		prt.println("short1 + short2 :" + (short1 + short2));

		Integer integer1 = 21;
		Integer integer2 = 25;
		prt.println("integer1 + integer2 :" + (integer1 + integer2));

		Long long1 = 569L;
		Long long2 = 560L;
		prt.println("long1 + long2 " + (long1 + long2));
		Float float1 = 3.6F;
		Float float2 = 6.9F;
		prt.println("float1 + float2 " + (float1 + float2));

		prt.println("byte1 + integer1 :" + (byte1 + integer1));
		prt.println("byte1 + short1 :" + (byte1 + short1));
		prt.println("byte1 + float1 :" + (byte1 + float1));
		prt.println("byte1 + float1 :" + (byte1 + float1));
		// prt.println(byte1 + true);

		//
		// Integer.p
		String s1 = "" + byte2;
		integer2 = Integer.parseInt(s1);
		prt.println("integer2 : " + integer2);

		String s = Byte.toString(byte2);
		integer2 = Integer.parseInt(s);
		prt.println("integer2 : " + integer2);
		integer2 = byte2.intValue();
		prt.println("integer2 : " + integer2);
		// integer2=long2.

	}
}
