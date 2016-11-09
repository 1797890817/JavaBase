package com.ddb.javacore.annotation;

import java.io.PrintStream;
import java.lang.reflect.Field;

public class AnnotDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		PrintStream out = System.out;
		Class<?> class1 = Cat.class;
		Cat cat = (Cat) class1.newInstance();
		Field[] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(HelloWorld.class)) {
				HelloWorld hWorld = field.getAnnotation(HelloWorld.class);
				out.println("hWorld.value() : " + hWorld.value());
				field.setAccessible(true);
				field.set(cat, hWorld.value());
			}
		}
		out.println("Cat : " + cat);

	}

}
