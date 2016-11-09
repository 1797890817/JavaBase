package com.ddb.javacore.generic;

class GenAr<T extends Number> {
	T ob;
	T vals[]; // OK

	GenAr(T o, T[] nums) {
		ob = o;
		// 不能实例化T的数组，因为T在运行时不存在
		// vals = new T[10];
		// 将形式参数赋值给vals是正确的
		vals = nums;
	}
}
