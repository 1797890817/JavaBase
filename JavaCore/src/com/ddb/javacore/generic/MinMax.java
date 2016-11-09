package com.ddb.javacore.generic;

interface MinMax<T extends Comparable<T>> {
	T min();

	T max();
}
