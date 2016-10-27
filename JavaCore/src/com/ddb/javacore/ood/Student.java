package com.ddb.javacore.ood;

import com.ddb.javacore.ood2.Teacher;

public class Student {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		System.out.println(teacher.toString());
/*		teacher.name=" dudongbin ";
		teacher.age= 31;
		teacher.isMan = true;
		teacher.sex = 0;*/
		teacher.teacher("Java");
		System.out.println(teacher.toString());
	}
}
