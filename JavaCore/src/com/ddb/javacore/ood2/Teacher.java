package com.ddb.javacore.ood2;

public class Teacher extends Human {
	String name;
	Integer age;
	Boolean isMan;
	Byte sex; // 0---表示男；1---女；2---太监；3---人妖；

	public Teacher() {
		// super();
		System.out.println("我是Teacher类，无参数的构造方法，我的作用是创建物种的一个实例！");
	}

	public Teacher(String name, Integer age) {
		System.out.println("我是Teacher类，两个参数的构造方法，我的作用是创建物种的一个实例！");
		// return;
		// super();
		this.name = name;
		this.age = age;
	}

	public Teacher(String name, Integer age, Boolean isMan, Byte sex) {
		// super();
		this(name, age);
		this.isMan = isMan;
		this.sex = sex;
		System.out.println("我是Teacher类， 4个参数的构造方法，我的作用是创建物种的一个实例！");
	}

	public void teacher(String course) {
		System.out.println("我是老师，我会讲课！");
		System.out.println("老师 " + name + " 教授的课程是：" + course);
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", isMan=" + isMan + ", sex=" + sex + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}