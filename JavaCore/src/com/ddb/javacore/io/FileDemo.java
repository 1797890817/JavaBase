package com.ddb.javacore.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class FileDemo {

	public static void main (String[] args) throws IOException {
		File f = new File("D:\\fileDemo\\Test\\Test.txt");//现在还没有
		//File f = new File("D:\\fileDemo");//现在还没有
		File f2 = new File("D:\\wamp\\bin\\mysql\\mysql5.6.17");
		File f3 = new File("D:\\wamp\\bin\\mysql\\mysql5.6.17\\my.ini");
		File f4 = new File("D:\\wamp\\bin\\mysql\\mysql5.6.17\\hide.txt");
		File f5 = new File("D:\\hide.txt");
		PrintStream out = System.out;
		File[] files = File.listRoots();
		out.println("File.listRoots() : ");
		for (File file2 : files) {
			out.println(file2);
		}

		out.println("File.pathSeparator : " + File.pathSeparator);
		out.println("File.pathSeparatorChar : " + File.pathSeparatorChar);
		out.println("File.separator : " + File.separator);
		out.println("File.separatorChar : " + File.separatorChar);
		
		out.println("f.exists()  : " + f.exists());
		out.println("f2.exists()  : " + f2.exists());
		out.println("f.isDirectory() : " + f.isDirectory());
		out.println("f2.isDirectory() : " + f2.isDirectory());
		
		out.println("f.isFile() : " + f.isFile());
		out.println("f2.isFile() : " + f2.isFile());
		out.println("f3.isFile() : " + f3.isFile());

		out.println("f.getAbsolutePath() : " + f.getAbsolutePath());
		out.println("f2.getAbsolutePath() : " + f2.getAbsolutePath());
		
		out.println("f.lastModified() : " + f.lastModified());
		out.println("f2.lastModified() : " + f2.lastModified());
		out.println("f3.lastModified() : " + f3.lastModified());
		
		out.println("f.length() : " + f.length());
		out.println("f2.length() : " + f2.length());
		out.println("f3.length() : " + f3.length());
		out.println("f4.length() : " + f4.length());
		
		out.println("f.canRead() : " + f.canRead());
		out.println("f2.canRead() : " + f2.canRead());
		out.println("f3.canRead() : " + f3.canRead());
		
		out.println("f.canWrite() :  " + f.canWrite());
		out.println("f2.canWrite() :  " + f2.canWrite());
		out.println("f3.canWrite() :  " + f3.canWrite());
		
		out.println("f3.getCanonicalPath() : " + f3.getCanonicalPath());
		out.println("f2.getCanonicalPath() : " + f2.getCanonicalPath());
		out.println("f.getCanonicalPath() : " + f.getCanonicalPath());
		
		out.println("f.getPath() : " + f.getPath());
		out.println("f2.getPath() : " + f2.getPath());
		out.println("f3.getPath() : " + f3.getPath());
		out.println("f.getParentFile() : " + f.getParentFile());
		out.println("f2.getParentFile() : " + f2.getParentFile());
		out.println("f3.getParentFile() : " + f3.getParentFile());
		
		out.println("f.getParent() : " + f.getParent());
		out.println("f2.getParent() : " + f2.getParent());
		out.println("f3.getParent() : " + f3.getParent());
		
		out.println("f.listFiles() : " + f.listFiles());
		out.println("f2.listFiles() : " + f2.listFiles());
		out.println("f3.listFiles() : " + f3.listFiles());
		File[] files2 = f2.listFiles();
		out.println("f2.listFiles() : " + f2.listFiles());
		for (File file : files2) {
			out.println(file);
		}
		
		out.println("f.isHidden() : " + f.isHidden());
		out.println("f2.isHidden() : " + f2.isHidden());
		out.println("f3.isHidden() : " + f3.isHidden()); 
		out.println("f4.isHidden() : " + f4.isHidden()); 
		
		out.println("f.canExecute() : " + f.canExecute());
		out.println("f2.canExecute() : " + f2.canExecute());
		out.println("f3.canExecute() : " + f3.canExecute());
		
		out.println("f.compareTo(f3) : " + f.compareTo(f3));
		out.println("f.getFreeSpace() : " + ((double)f.getFreeSpace()/1024/1024/1024) + "GB");
		out.println("f2.getFreeSpace() : " + ((double)f2.getFreeSpace()/1024/1024/1024) + "GB");
		out.println("f3.getFreeSpace() : " + ((double)f3.getFreeSpace()/1024/1024/1024) + "GB");
		
		out.println("f2.getTotalSpace() : " + ((double)f2.getTotalSpace()/1024/1024/1024) + "GB");
		 
		out.println("f2.getUsableSpace() : " + ((double)f2.getUsableSpace()/1024/1024/1024)+ "GB");
		
		out.println("f.getName() : " + f.getName());
		out.println("f2.getName() : " + f2.getName());
		out.println("f3.getName() : " + f3.getName());
		
		out.println("f5.createNewFile() : " + f5.createNewFile());
		File parentPath = f.getParentFile();
		
		if (!parentPath.exists()) {
			out.println("parentPath.mkdirs() : " + parentPath.mkdirs());
			
			//out.println("f.delete() : " + f.delete());
		}
		out.println("f.createNewFile() : " + f.createNewFile());
		
		if (f.exists()){
/*			f.deleteOnExit();
			out.println("f.deleteOnExit() : " );*/
			out.println("f.delete() : " + f.delete());
			
		}
		
		
	}

}
