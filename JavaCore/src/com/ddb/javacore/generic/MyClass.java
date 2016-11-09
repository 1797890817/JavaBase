package com.ddb.javacore.generic;

class MyClass<T extends Comparable<T>> implements MinMax<T> {
	T[] vals;

	MyClass(T[] o) {
		vals = o;
	}

	// 返回最小值
	public T min() {
		T v = vals[0];
		for (int i = 1; i < vals.length; i++)
			if (vals[i].compareTo(v) < 0)
				v = vals[i];
		return v;
	}

	// 返回最大值
	public T max() {
		T v = vals[0];
		for (int i = 1; i < vals.length; i++)
			if (vals[i].compareTo(v) > 0)
				v = vals[i];
		return v;
	}
}
