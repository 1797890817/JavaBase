package com.ddb.javacore.ood4;

import lombok.Getter;
import lombok.Setter;

public abstract class Phone {
	@Setter
	@Getter
	private String model;
	
	// private String vender;
	@Getter
	@Setter
	private static String os = "Android";
	
	public Phone() {
		super();
		System.out.println("我是抽象父类，现在执行的是抽象父类的构造方法！");
	}
	
	public abstract void startOs();

	public void printSelf() {
		System.out.println("我的型号是 ： " + model);
	}
}
