package com.ddb.javacore.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class ReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		PrintStream out = System.out;
		File file = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "Reader.txt");

		File file2 = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "Reader_CN.txt");

		/*out.println("文件的内容是： ");
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
		out.println(new String(b2));*/

		//Writer writer = new FileWriter(file,true);
		OutputStream out2 = new FileOutputStream(file2,true);
		Writer writer = new OutputStreamWriter(out2, "GBK");
		
		//String enString ="\r\n+++++China People! ++++2++++";
		String chString ="\r\n+++++中国人民从此站起来了! ++++2++++";
		//writer.write(enString);
		writer.write(chString);
		writer.flush();	//刷新缓存区
		//out.println("向文件写入：" + enString);
		out.println("向文件写入：" + chString);
	}

}
