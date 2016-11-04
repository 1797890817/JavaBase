package com.ddb.javacore.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamDemo {

	public static void main(String[] args) throws IOException {
		PrintStream out = System.out;
		File file = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "test3.txt");
		
		OutputStream os = null;
		try {
			os = new FileOutputStream(file,true);
			//String name = "wangwu";
			String name = "\r\nlisi";
			byte[] b = name.getBytes();
			os.write(b);
			
			out.println("文件写入的内容是 ：" +name);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			os.close();
			out.println("os 流 关闭");
		}
		
	}

}
