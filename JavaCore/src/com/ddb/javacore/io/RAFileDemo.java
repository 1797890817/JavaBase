package com.ddb.javacore.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;

public class RAFileDemo {

	public static void main(String[] args) throws IOException {
		PrintStream out = System.out;
		File file = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "test.txt");

		// 向文件里写数据
		RandomAccessFile rafile = new RandomAccessFile(file, "rw");
		String name = null;
		// Integer age =null;
		int age;

		name = "zhangsan"; // 8个字符
		age = 32;
		out.println("Write :zhangsan   32");
		rafile.writeInt(age);
		rafile.write(name.getBytes());
		rafile.close();

		// 读数据
		RandomAccessFile rafile2 = new RandomAccessFile(file, "r");
	/*	String name2;
		Integer age2;*/
		int ret = rafile2.readInt();
		out.println(ret);
		// rafile2.skipBytes(4);
		byte[] bytes = new byte[name.length()];
		rafile2.read(bytes); // 这一行很重要

		out.println(new String(bytes));
		rafile2.close();
	}

}
