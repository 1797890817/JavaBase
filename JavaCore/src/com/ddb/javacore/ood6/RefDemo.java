package com.ddb.javacore.ood6;

import java.io.PrintStream;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class RefDemo {
	private String name;
	private Integer age;
	private String work;
	static {
		System.out.println("我是static语句块中的内容");
	}

	public RefDemo(String name, Integer age, String work) {
		super();
		this.name = name;
		this.age = age;
		this.work = work;
		System.out.println("我是构造方法中的打印语句，我已经创建了对象");
	}
		
	public RefDemo getRefDemo(RefDemo other) {

		RefDemo refDemo = new RefDemo("-----", 36, "TTTT");
		other = refDemo;		
		return  other;
	}

	
	
	public static void main(String kl[]){
		PrintStream out = System.out;
		out.println("****************************");
		out.println("kl ---0: " + kl[0]);
		out.println("kl ---1: " + kl[1]);
		out.println("****************************");
		RefDemo refDemo1 = new RefDemo("zhangsan--lisi", 21, "worker");
		RefDemo refDemo2 = new RefDemo("lisi--zhangsan", 12, "rekrow");
		out.println("refDemo1 :" + refDemo1);
		out.println("refDemo2 :" + refDemo2);
		refDemo2 = refDemo1;
		out.println("refDemo2 :"+ refDemo2);
		refDemo2.setName("lisi--zhangsan");
		out.println("refDemo2.setName :"+"lisi--zhangsan");
		out.println("refDemo2 :"+ refDemo2);
		out.println("refDemo1 :" + refDemo1);
		out.println("-----------------------------------------------");
		
		refDemo1 = refDemo1.getRefDemo(refDemo1);
		out.println(refDemo1);
		out.println(refDemo1);
		
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RefDemo [name=" + name + ", age=" + age + ", work=" + work + "]";
	}
}
