package com.ddb.javacore.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;

public class RAFileDemo2 {

	public static void main(String[] args) throws IOException {
		PrintStream out = System.out;
		File file = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "test2.txt");

		// 向文件里写数据
		RandomAccessFile rafile = new RandomAccessFile(file, "rw");
		String name = null;
		// Integer age =null;
		int age;

		name = "张三"; // 
		age = 32;
		out.println("Write :张三      32");
		rafile.writeInt(age);
		//rafile.write(name.getBytes());
		rafile.write(name.getBytes());
		rafile.close();

		// 读数据
		RandomAccessFile rafile2 = new RandomAccessFile(file, "r");
	/*	String name2;
		Integer age2;*/
		int ret = rafile2.readInt();
		out.println(ret);
		byte[] bytes = new byte[name.getBytes().length];	//中文字串不要使用字串的长度,要使用字串得到的数组的长度
		rafile2.read(bytes); // 这一行很重要
		
		out.println(new String(bytes));
		rafile2.close();
	}

}
