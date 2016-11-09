package com.ddb.javacore.generic;

public class NonGen {
	//使用Object达到类似泛型效果的例子
	Object ob;

	NonGen(Object o) {
		ob = o;
	}

	Object getob() {
		return ob;
	}

	void showType() {
		System.out.println("Type of ob is " + ob.getClass().getName());
	}
}
