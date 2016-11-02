package com.ddb.javacore.ood2;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class Human {
	private String id;
	
	private String name;
	private Integer age;
	private String work;
	
	
	public Human() {
		//super();
		System.out.println("这是Human 类的无参构造方法，作用创建Human类的一个实例对象");
	}
	
	
	public Human(String id, String name, Integer age, String work) {
		//super();
		this();
		this.id = id;
		this.name = name;
		this.age = age;
		this.work = work;
		System.out.println("这是Human 类的4个参数构造方法，作用创建Human类的一个实例对象");
	}




	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + "]";
	}


	public Human(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
}
