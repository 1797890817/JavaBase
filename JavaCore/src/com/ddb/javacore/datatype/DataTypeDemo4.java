package com.ddb.javacore.datatype;

import java.io.PrintStream;

public class DataTypeDemo4 {
	public static void main(String[] args) {
		PrintStream prt = System.out;
		Integer integer1 = 9;
		Integer integer2 = 5;
		prt.println("integer1 : " + Integer.toBinaryString(integer1));
		
		prt.println("integer1 & intege2 = " + (integer1 & integer2));
		prt.println("integer1 | intege2 = " + (integer1 | integer2));
		prt.println("integer1 | intege2 二进制= " + Integer.toBinaryString(integer1 | integer2));
		prt.println("integer1 ^ intege2 = " + (integer1 ^ integer2));
		prt.println("integer1 ^ intege2 二进制= " + Integer.toBinaryString(integer1 ^ integer2));
		prt.println("integer1 左移1位  " + (integer1 << 1));
		prt.println("integer1 左移1位 二进制   " + Integer.toBinaryString(integer1 << 1));
		prt.println("integer1 左移31位  " + (integer1 << 31));
		prt.println("integer1 左移31位 二进制   " + Integer.toBinaryString(integer1 << 31));
		prt.println("integer1 左移30位  " + (integer1 << 30));
		prt.println("integer1 左移30位 二进制   " + Integer.toBinaryString(integer1 << 30));
		prt.println("integer1 左移32位  " + (integer1 << 32));
		prt.println("integer1 左移32位 二进制   " + Integer.toBinaryString(integer1 << 32));
		prt.println("integer1 右移1位  " + (integer1 >> 1));
		prt.println("integer1 左移1位 二进制   " + Integer.toBinaryString(integer1 >> 1));
		prt.println("integer1 右移32位  " + (integer1 >> 32));
		prt.println("integer1 左移32位 二进制   " + Integer.toBinaryString(integer1 >> 32));
		prt.println("integer1 右移4位  " + (integer1 >> 4));
		prt.println("integer1 左移4位 二进制   " + Integer.toBinaryString(integer1 >> 4));
		
		prt.println("integer1 右移1位 >>>" + (integer1 >>> 1));
		prt.println("integer1 左移1位 二进制 >>>" + Integer.toBinaryString(integer1 >>> 1));
		prt.println("integer1 右移2位 >>>" + (integer1 >>> 2));
		prt.println("integer1 左移2位 二进制 >>>" + Integer.toBinaryString(integer1 >>> 2));
		prt.println("integer1 右移32位 >>>" + (integer1 >>> 32));
		prt.println("integer1 左移32位 二进制 >>>" + Integer.toBinaryString(integer1 >>> 32));
	}
}
