package com.ddb.javacore.datatype;

import java.io.PrintStream;

public class DataTypeDemo2 {
	public static void main(String[] args) {
		PrintStream prt = System.out;
		// byte demo
		// 声明变量
		prt.println("Byte Demo:");
		prt.println("Byte.MIN_VALUE: " + Byte.MIN_VALUE + ";");
		prt.println("Byte.MAX_VALUE " + Byte.MAX_VALUE + ";");
		prt.println("Byte.SIZE " + Byte.SIZE + ";");
		prt.println("Byte.BYTES " + Byte.BYTES + ";");
		prt.println("Byte.MAX_VALUE + 1 = " + (Byte.MAX_VALUE + 1) + ";");
		prt.println("Byte.MAX_VALUE + 1 = " + (Byte.MAX_VALUE + 2) + ";");
		Byte byte1 = 127;
		prt.print("byte1 :" + byte1);
		byte1 = (byte) (byte1 + 1);
		prt.println("byte1 + 1 :" + byte1);
		byte1 = (byte) (byte1 + 1);
		prt.println("byte1 + 2 :" + byte1);
		
		//Char
		prt.println();
		prt.println("Character Demo:");
		prt.println("Character.SIZE: " + Character.SIZE + ";");
		prt.println("Character.MIN_VALUE " + Character.MIN_VALUE+ ";");
		prt.println("Character.MAX_VALUE " + Character.MAX_VALUE+ ";");


		// Short
		prt.println();
		prt.println("Short Demo:");
		prt.println("Byte.MIN_VALUE: " + Short.MIN_VALUE + ";");
		prt.println("Byte.MAX_VALUE " + Short.MAX_VALUE + ";");
		prt.println("Byte.SIZE " + Short.SIZE + ";");
		prt.println("Byte.TYPE " + Short.TYPE + ";");
		
		//Integer
		prt.println();
		prt.println("Integer Demo:");
		prt.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE + ";");
		prt.println("Integer.MAX_VALUE " + Integer.MAX_VALUE + ";");
		prt.println("Integer.SIZE " + Integer.SIZE + ";");
		prt.println("Integer.TYPE " + Integer.TYPE + ";");
		prt.println("Integer.class " + Integer.class + ";");
		
		//Long
		prt.println();
		prt.println("Long Demo:");
		prt.println("Long.MIN_VALUE: " + Long.MIN_VALUE + ";");
		prt.println("Long.MAX_VALUE " + Long.MAX_VALUE + ";");
		prt.println("Long.SIZE " + Long.SIZE + ";");
		prt.println("Long.TYPE " + Long.TYPE + ";");
		prt.println("Long.class " + Long.class + ";");
		
		//Float
		prt.println();
		prt.println("Float Demo:");
		prt.println("Float.MIN_VALUE: " + Float.MIN_VALUE + ";");
		prt.println("Float.MAX_VALUE " + Float.MAX_VALUE + ";");
		prt.println("Float.SIZE " + Float.SIZE + ";");
		prt.println("Float.TYPE " + Float.TYPE + ";");
		prt.println("Float.MAX_EXPONENT " + Float.MAX_EXPONENT + ";");
		prt.println("Float.MIN_EXPONENT " + Float.MIN_EXPONENT + ";");
		prt.println("Float.MIN_NORMAL " + Float.MIN_NORMAL + ";");
		
		//Double
		prt.println();
		prt.println("Double Demo:");
		prt.println("Double.MIN_VALUE: " + Double.MIN_VALUE + ";");
		prt.println("Double.MAX_VALUE " + Double.MAX_VALUE + ";");
		prt.println("Double.SIZE " + Double.SIZE + ";");
		prt.println("Double.TYPE " + Double.TYPE + ";");
		prt.println("Double.MAX_EXPONENT " + Double.MAX_EXPONENT + ";");
		prt.println("Double.MIN_EXPONENT " + Double.MIN_EXPONENT + ";");
		prt.println("Double.MIN_NORMAL " + Double.MIN_NORMAL + ";");
		prt.println("Double.NaN " + Double.NaN + ";");
		prt.println("Double.NEGATIVE_INFINITY " + Double.NEGATIVE_INFINITY + ";");
		prt.println("Double.POSITIVE_INFINITY " + Double.POSITIVE_INFINITY + ";");
		
		
	}
}
