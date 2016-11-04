package com.ddb.javacore.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;
import java.util.Date;

public class WriterDemo {

	public static void main(String[] args) throws IOException{
		PrintStream out = System.out;
		File file = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "Reader.txt");

		File file2 = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "Reader_CN.txt");
		
		Writer writer = new FileWriter(file, true);
		out.println("向文件尾部追加内容：");
		Date date = new Date();
		String enString = "\r\nzhangsan12365" + date;
		String enString2 = "\r\n中国人" + date;
		writer.write(enString);
		writer.write(enString2);
		//writer.close();
		out.println("向文件尾部追加内容结束");
		
	}

}
