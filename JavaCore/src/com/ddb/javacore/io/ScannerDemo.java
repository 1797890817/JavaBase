package com.ddb.javacore.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out = System.out;
		Scanner scanner = new Scanner(System.in);

		int r;
		double s;
		
		out.println("计算圆的面积需要一个半径的参数：");
		out.println("请输入一个数字：");
		if (scanner.hasNextInt()) {
			r = scanner.nextInt();
			s = 3.14*r*r;
			out.println("圆的面积s等于：  " + s);
			out.println("圆的周长等于：  " + 3.14*2*r);
			
		} else {
			out.println("参数输入错误，您输入的是 ：" + scanner.next());
		}
		
		out.println("请输入一个Double数字：");
		out.println("输入一个Double数字：" + scanner.nextDouble());
		
		out.println("请输入一个布尔值：");
		if (scanner.hasNextBoolean()) {
			out.println("布尔值：" + scanner.hasNextBoolean());
			
		} else {
			out.println("NOT 布尔值：" + scanner.next());
			
		}
		
		scanner.close();
		
		File file = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "scanner.txt");
		InputStream is = new FileInputStream(file);
		Scanner scanner2 = new Scanner(is,"GBK");
		out.println("文件的内容是：");
		while (scanner2.hasNextLine()) {
			out.println(scanner2.nextLine());
		}
		
		scanner2.close();
	}

	

}
