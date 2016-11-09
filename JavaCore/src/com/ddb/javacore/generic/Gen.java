package com.ddb.javacore.generic;

class Gen<T> {
	T ob;

	Gen(T o) {
		ob = o;
	}

	T getob() {
		return ob;
	}

	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}
