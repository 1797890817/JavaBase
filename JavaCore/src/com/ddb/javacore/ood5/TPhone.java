package com.ddb.javacore.ood5;

public class TPhone implements IiPhone {

	@Override
	public void startOS() {
		System.out.println("我是锤子手机，我实现了IiPhone接口的 startOS方法！");
	}

	@Override
	public void printSelfName() {
		System.out.println("我是锤子手机，我实现了IiPhone接口的 printSelfName方法！");
	}

	public static void main(String[] args) {
		IiPhone iiPhone = new TPhone();
		iiPhone.startOS();
		iiPhone.printSelfName();

	}

}
