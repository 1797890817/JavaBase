package com.ddb.javacore.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;

public class ReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		PrintStream out = System.out;
		File file = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "Reader.txt");

		File file2 = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "Reader_CN.txt");

		out.println("文件的内容是： ");
		Reader reader = new FileReader(file);
		char[] b = new char[1024];
		reader.read(b);
		out.println("b : " + b);
		out.println(new String(b));

		out.println("中文文件的内容是： ");
		InputStream in = new FileInputStream(file2);
		Reader reader2 = new InputStreamReader(in, "GBK");
		char[] b2 = new char[(int) file2.length()];
		reader2.read(b2);
		out.println("b2 : " + b2);
		out.println(new String(b2));

	}

}
