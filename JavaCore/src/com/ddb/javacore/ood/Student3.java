package com.ddb.javacore.ood;

public class Student3 {
	public static void main(String[] args) {
		Teacher2 teacher2 = new Teacher2();
/*		teacher2.setName(" dudongbin ");
		teacher2.setAge(-31);
		teacher2.isMan = true;
		teacher2.sex = 0;*/
		teacher2.teacher("Java");
		System.out.println(teacher2.toString());
	}
}
