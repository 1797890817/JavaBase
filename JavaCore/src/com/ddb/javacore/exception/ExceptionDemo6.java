package com.ddb.javacore.exception;

public class ExceptionDemo6 {
	
	public static void throwEx() throws Exception {
		System.out.println("现在正在执行--throwEx方法开始!");
		throw new Exception();
	}
	public static void throwEx2(int x) throws Exception {
		if (x==0) {
			throw new FileNotFoundException();
		}
		System.out.println("现在正在执行--throwEx2方法开始!");
		//System.out.println("现在正在执行--throwEx方法结束!");
		
	}
	
	
	public static void main(String[] args) {

		System.out.println("调用方法之前!");
		try {
			//ExceptionDemo6.throwEx2(0);
			ExceptionDemo6.throwEx();
		} catch (FileNotFoundException e) {
			System.out.println("捕捉到异常! :" + e.getClass().getName());
			e.printStackTrace();
		} catch (Exception  e) {
		System.out.println("捕捉到异常! :" + e.getClass().getName());
		e.printStackTrace();
	}
		System.out.println("调用方法之后!");
		
	}

}
