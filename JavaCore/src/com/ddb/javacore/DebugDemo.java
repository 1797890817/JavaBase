package com.ddb.javacore;

import com.ddb.javacore.reflect.Person;

public class DebugDemo {

	public static void main(String[] args) {
		int all = 0;
		int avg = 63;
		
		for (int i = 1; i <= 100; i++) {
			all +=i; 
			
		}
		Person person = new Person("zhangsan02", 36);
		System.out.println("person.getName() :" + person.getName());
		Person person2 = new Person(32);
		//person2.getName().length();
		
	}
	
	
}
