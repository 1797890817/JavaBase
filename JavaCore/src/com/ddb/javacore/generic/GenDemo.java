package com.ddb.javacore.generic;

class GenDemo {
	public static void main(String args[]) {
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);
		// iOb = new Gen<Integer>(88.8);
		iOb.showType();
		int v = iOb.getob(); // 此处不需要类型转换
		System.out.println("value: " + v);
		System.out.println();
		Gen<String> strOb = new Gen<String>("Generics Test");
		strOb.showType();
		String str = strOb.getob(); // 此处不需要类型转换
		System.out.println("value: " + str);
		// iOb = strOb;
	}
}
