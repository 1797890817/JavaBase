package com.ddb.javacore.generic;

class NonGenDemo {
	public static void main(String args[]) {
		NonGen iOb;
		iOb = new NonGen(88);
		iOb.showType();
		int v = (Integer) iOb.getob(); // 类型转换是必须的，Object不能转换为int
		System.out.println("value: " + v);
		System.out.println();
		
		NonGen strOb = new NonGen("Non-Generics Test");
		strOb.showType();
		String str = (String) strOb.getob(); // 类型转换是必须的
		System.out.println("value: " + str);
		iOb = strOb; // 编译通过，但在概念上是错误的！
		v = (Integer) iOb.getob(); // 运行时发生错误!
	}
}
