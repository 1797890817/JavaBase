package com.ddb.javacore.reflect;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassDemo {

	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException,
			IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		PrintStream out = System.out;
		// 第一种得到Class 实例的方式
		Class<?> class1 = Class.forName("com.ddb.javacore.reflect.Person");
		// 第二种得到Class 实例的方式
		Class<?> class2 = Person.class;
		// 第三种得到Class 实例的方式
		Class<?> class3 = new Person().getClass();

		out.println(class1);
		out.println(class2);
		out.println(class3);

		out.println(class1.getName());
		out.println(class2.getName());
		out.println(class3.getName());

		out.println("class1.getComponentType() : " + class1.getComponentType());
		out.println("class1.getModifiers() :" + class1.getModifiers());
		out.println("class1.getSimpleName() :" + class1.getSimpleName());
		out.println("class1.getTypeName() :" + class1.getTypeName());
		out.println("class1.getClassLoader() : " + class1.getClassLoader());
		out.println("class1.getDeclaredMethods() :");
		out.println("该类拥有的方法：");
		Method[] methods = class1.getDeclaredMethods();
		for (Method method : methods) {
			out.println("method : " + method);
		}

		Field[] fields = class1.getDeclaredFields();
		out.println("该类拥有的字段：");
		for (Field field : fields) {
			out.println("field : " + field);
		}

		// 利用反射创建Person类的实例
		Person obj = (Person) class1.newInstance();

		// 访问指定的字段
		out.println("访问指定的字段 :age");
		Field fname = class1.getDeclaredField("name");
		Field fage = class1.getDeclaredField("age");

		fname.setAccessible(true);
		out.println("fname.get(obj) :" + fname.get(obj));
		fage.setAccessible(true);
		out.println("fage.get(obj) :" + fage.get(obj));

		out.println("通过反射设定属性：");
		fname.set(obj, "zhangsan01");
		fage.set(obj, 32);
		out.println("fname.get(obj) :" + fname.get(obj));
		fage.setAccessible(true);
		out.println("fage.get(obj) :" + fage.get(obj));
		out.println("obj.toString() :" + obj.toString());

		out.println("通过反射唤醒或执行被反射对象的方法：");
		Method method = class1.getMethod("printPersonSelf");

		out.println("唤醒printPersonSelf：");
		method.invoke(obj);

	}

}
