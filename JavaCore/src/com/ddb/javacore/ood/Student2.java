package com.ddb.javacore.ood;

import com.ddb.javacore.ood2.Teacher;

public class Student2 {
	public static void main(String[] args) {
		//Teacher teacher2 = new Teacher();
		Teacher teacher = new Teacher("dudongbin",31,true,(byte)0);
		System.out.println(teacher);
		System.out.println(teacher.toString());
/*		teacher.name = " dudongbin ";
		teacher.age = 31;
		teacher.isMan = true;
		teacher.sex = 0;*/
		teacher.teacher("Java");
		System.out.println(teacher.toString());
		
		Teacher2 teacher2 = new Teacher2();
		System.out.println(teacher2.toString());
		
	}
}
