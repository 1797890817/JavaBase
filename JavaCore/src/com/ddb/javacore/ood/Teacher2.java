package com.ddb.javacore.ood;

public class Teacher2 {
	private String name;
	private Integer age;

	private Boolean isMan;
	private Byte sex; // 0---表示男；1---女；2---太监；3---人妖；

	public Teacher2() {
		// super();
		System.out.println("我是Teacher类，无参数的构造方法，我的作用是创建物种的一个实例！");
	}

	public Teacher2(String name, Integer age) {
		System.out.println("我是Teacher类，两个参数的构造方法，我的作用是创建物种的一个实例！");
		// return;
		// super();
		this.name = name;
		this.age = age;
	}

	public Teacher2(String name, Integer age, Boolean isMan, Byte sex) {
		// super();
		this(name, age);
		this.isMan = isMan;
		this.sex = sex;
		System.out.println("我是Teacher类， 4个参数的构造方法，我的作用是创建物种的一个实例！");
	}

	public String getName() {

		return this.name;
	}

	public Boolean setName(String name) {
		this.name = name;
		return true;
	}

	public Integer getAge() {
		return this.age;
	}

	public Boolean getIsMan() {
		return isMan;
	}

	public void setIsMan(Boolean isMan) {
		this.isMan = isMan;
	}

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean setAge(int age) {

		if (age >= 0) {

			this.age = age;
			return true;
		} else {
			System.out.println("输入数值非法，设置失败！");
			return false;
		}

	}

	 void teacher(String course) {
		System.out.println("老师 " + name + " 教授的课程是：" + course);
	}

	@Override
	public String toString() {
		return "Teacher2 [name=" + name + ", age=" + age + ", isMan=" + isMan + ", sex=" + sex + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}