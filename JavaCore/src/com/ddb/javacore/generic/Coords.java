package com.ddb.javacore.generic;

class Coords<T extends TwoD> {
	T[] coords;

	Coords(T[] o) {
		coords = o;
	}
}