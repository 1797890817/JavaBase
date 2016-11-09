package com.ddb.javacore.generic;

class StatsBoundsDemo {
	public static void main(String args[]) {
		Integer inums[] = { 1, 2, 3, 4, 5 };
		Stats<Integer> iob = new Stats<Integer>(inums);
		double v = iob.average();
		System.out.println("iob average is " + v);
		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats<Double> dob = new Stats<Double>(dnums);
		double w = dob.average();
		System.out.println("dob average is " + w);
		// 下面的语句不能编译，因为String不是Number的子类
		// String strs[] = { "1", "2", "3", "4", "5" };
		// Stats<String> strob = new Stats<String>(strs);
		// double x = strob.average();
		// System.out.println("strob average is " + v);
	}
}
