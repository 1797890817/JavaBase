package com.ddb.javacore.ood4;

public class MPhone extends Phone {

	@Override
	public void startOs() {
		System.out.println("我是MPhone手机，我正在启动系统！" + Phone.getOs());
		System.out.println("我是MPhone手机，我正在启动系统！" + MPhone.getOs());
	}
}
