package com.ddb.javacore.generic;

class RawDemo {
	public static void main(String args[]) {
		Gen<Integer> iOb = new Gen<Integer>(88);
		Gen<String> strOb = new Gen<String>("Generics Test");
		// 创建一个原始类型Gen对象，并给它一个double值
		Gen raw = new Gen(new Double(98.6));
		// 转换是必要的，因为类型未知
		double d = (Double) raw.getob();
		System.out.println("value: " + d);
		// 原始类型的使用会导致运行时异常，例子如下
		// 下面的转换会导致运行时错误！
		// int i = (Integer) raw.getob(); // run-time error
		// 可以赋值，但有潜在的错误
		strOb = raw;
		// String str = strOb.getob(); // run-time error
		// 可以赋值，但有潜在的错误
		raw = iOb;
		// d = (Double) raw.getob(); // run-time error
	}
}
