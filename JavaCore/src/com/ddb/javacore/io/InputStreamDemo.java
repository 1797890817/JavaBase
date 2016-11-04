package com.ddb.javacore.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		PrintStream out = System.out;
		File file = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "test3.txt");
		
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			//byte[] b =new byte[128];
			byte[] b =new byte[(int)file.length()];	//使用文件的长度去创建一个数组
			is.read(b);
			is.close();
			
			out.println("文件的内容是 ：" + new String(b));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			is.close();
			out.println("is 流 关闭");
		}
		
	}

}
