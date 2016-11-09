package com.ddb.javacore.generic;

class GenArrays {
	public static void main(String args[]) {
		Integer n[] = { 1, 2, 3, 4, 5 };
		GenAr<Integer> iOb = new GenAr<Integer>(50, n);
		// 不能声明对特定泛型类型的引用的数组，会导致类型安全的丧失
		// GenAr<Integer> gens[] = new GenAr<Integer>[10];
		// 使用通配符，可创建泛型类型的引用的数组
		GenAr<?> gens[] = new GenAr<?>[10]; // OK
		Integer ig[] = { 5, 6, 7, 8, 9 };
		gens[0] = new GenAr<Integer>(50, ig);
		System.out.println("泛型数组的第一个元素");
		System.out.println(gens[0].ob);
		for (Number ss : gens[0].vals)
			System.out.println(ss);
		// 泛型数组的第二个元素
		Double dg[] = { 1.1, 2.2, 3.3 };
		gens[1] = new GenAr<Double>(11.1, dg);
		System.out.println("泛型数组的第二个元素");
		System.out.println(gens[1].ob);
		for (Number ss : gens[1].vals)
			System.out.println(ss);
	}
}
