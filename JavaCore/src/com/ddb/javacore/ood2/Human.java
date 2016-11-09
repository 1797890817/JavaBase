package com.ddb.javacore.ood2;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Human implements Serializable, Comparable<Human> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;

	private Integer age;
	private String work;

	public Human() {
		// super();
		System.out.println("这是Human 类的无参构造方法，作用创建Human类的一个实例对象");
	}

	public Human(String id, String name, Integer age, String work) {
		// super();
		this();
		this.id = id;
		this.name = name;
		this.age = age;
		this.work = work;
		System.out.println("这是Human 类的4个参数构造方法，作用创建Human类的一个实例对象");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

	public Human(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Human o) {

		if (this.getAge().intValue() == o.getAge().intValue()) {
			return 0;
		} else if (this.getAge().intValue() > o.getAge().intValue()) {
			return 1;
		} else {
			return -1;
		}
	}

	public Human(String id, Integer age) {
		super();
		this.id = id;
		this.age = age;
	}

}
