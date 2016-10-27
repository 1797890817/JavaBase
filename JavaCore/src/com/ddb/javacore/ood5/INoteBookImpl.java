package com.ddb.javacore.ood5;

public class INoteBookImpl implements INoteBook {

	@Override
	public void startOS() {
		System.out.println("我是另一个INoteBook接口的实现类，我正在启动系统！");

	}

	@Override
	public void printSelfName() {
		System.out.println("我是另一个INoteBook接口的实现类，我的实现类的名字是： " + this.getClass());
	}

	@Override
	public void usePs() {
		System.out.println("我是另一个INoteBook接口的实现类，我也可以使用PS！ ");

	}

	public static void main(String[] args) {
		INoteBook impl = new INoteBookImpl();
		impl.startOS();
		impl.printSelfName();
		impl.usePs();

		System.out.println("************************************************");
		INoteBook impl2 = new TestInterface();
		impl2.startOS();
		impl2.printSelfName();
		impl2.usePs();

	}

}
