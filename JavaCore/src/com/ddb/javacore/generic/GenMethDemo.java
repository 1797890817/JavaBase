package com.ddb.javacore.generic;

class GenMethDemo {
	// 判断一个对象是否在数组中
	static <T, V extends T> boolean isIn(T x, V[] y) {
		for (int i = 0; i < y.length; i++)
			if (x.equals(y[i]))
				return true;
		return false;
	}

	public static void main(String args[]) {
		// 对整数调用isIn()
		Integer nums[] = { 1, 2, 3, 4, 5 };
		// int nums[] = { 1, 2, 3, 4, 5 };
		if (isIn(2, nums))
			System.out.println("2 is in nums");
		if (!isIn(7, nums))
			System.out.println("7 is not in nums");
		System.out.println();
		// 对字符串调用isIn()
		String strs[] = { "one", "two", "three", "four", "five" };
		if (isIn("two", strs))
			System.out.println("two is in strs");
		if (!isIn("seven", strs))
			System.out.println("seven is not in strs");
		// 注意，有编译错误！类型必须一致。
		// if(isIn("two", nums))
		// System.out.println("two is in strs");
	}
}
