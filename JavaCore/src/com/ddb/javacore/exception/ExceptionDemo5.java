package com.ddb.javacore.exception;

public class ExceptionDemo5 {
	
	public static void throwEx() throws Exception {
		System.out.println("现在正在执行--throwEx方法开始!");
		throw new Exception();
		//System.out.println("现在正在执行--throwEx方法结束!");
		
	}
	public static void throwEx2(int x) throws Exception {
		if (x==0) {
			throw new Exception();
		}
		System.out.println("现在正在执行--throwEx方法开始!");
		//System.out.println("现在正在执行--throwEx方法结束!");
		
	}
	
	
	public static void main(String[] args) {
		//PrintStream out = System.out;
/*		System.out.println("调用方法之前!");
		try {
			ExceptionDemo5.throwEx();
		} catch (Exception e) {
			System.out.println("捕捉到异常!");
			e.printStackTrace();
		}
		System.out.println("调用方法之后!");*/
		
		System.out.println("调用方法之前!");
		try {
			ExceptionDemo5.throwEx2(0);
		} catch (Exception e) {
			System.out.println("捕捉到异常!");
			e.printStackTrace();
		}
		System.out.println("调用方法之后!");
		
	}

}
