package com.ddb.javacore.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;

public class BufferDemo {

	public static void main(String[] args) throws IOException {
		PrintStream out = System.out;
		File src = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "test3.txt");
		File dest = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "test3Copy.txt");
		
		Reader in = new FileReader(src);
		BufferedReader bReader = new BufferedReader(in);
		
		Writer writer = new FileWriter(dest);
		BufferedWriter bWriter = new BufferedWriter(writer);
		String tmp = bReader.readLine();
		while (tmp != null) {
			bWriter.write(tmp);
			bWriter.newLine();
			tmp = bReader.readLine();
		}
		
		bReader.close();
		in.close();
		bWriter.close();
		writer.close();
		out.println("文件复制完成！");
		
	}

}
