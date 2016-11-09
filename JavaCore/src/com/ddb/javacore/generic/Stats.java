package com.ddb.javacore.generic;

class Stats<T extends Number> {
	T[] nums; // array of Number or subclass

	Stats(T[] o) {
		nums = o;
	}

	double average() {
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++)
			sum += nums[i].doubleValue();
		return sum / nums.length;
	}

	/*// 类型不一致不能使用
	boolean sameAvg() {
		Integer inums[] = { 1, 2, 3, 4, 5 };
		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats<Integer> iob = new Stats<Integer>(inums);
		Stats<Double> dob = new Stats<Double>(dnums);
		if (iob.sameAvg(dob)) {
			System.out.println("are the same.");
			return true;
		} else {
			System.out.println("differ.");
			return false;
		}
	}*/

	/*
	 * // 如果出现类型不一致也不能使用 boolean sameAvg(Stats<T> ob) { if (average() ==
	 * ob.average()) return true; return false; }
	 */

	boolean sameAvg(Stats<?> ob) {
		if (average() == ob.average())
			return true;
		return false;
	}

}
