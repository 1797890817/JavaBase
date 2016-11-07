package com.ddb.javacore.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class BufferInputStreamDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		PrintStream out = System.out;
		File pdfFile = new File("/home/deepin/结婚照原始及精修片(CD1).iso");
		File pdfFile2 = new File("/home/deepin/结婚照原始及精修片(CD1)BK.iso");
		File pdfFile3 = new File("/home/deepin/结婚照原始及精修片(CD1)BK2.iso");
		unUseBufferCopyFile(out, pdfFile, pdfFile2);
		out.println("等待8S中...");
		Thread.sleep(8000);
		useBufferedCopyFile(out, pdfFile, pdfFile3);
	}

	private static void useBufferedCopyFile(PrintStream out, File pdfFile, File pdfFile3)
			throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream(pdfFile);
		FileOutputStream fos = new FileOutputStream(pdfFile3);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		byte[] unit = new byte[4096];// 数组的大小为4KB,作为数据的传输单元
		long start = System.currentTimeMillis();
		out.println("使用缓冲器--现在的开始时间毫秒是：" + start + " ms");
		/*while (bis.available() > 0) {
			if (bis.available() >= 4096) {
				bis.read(unit);
				bos.write(unit);
			} else {
				out.println("剩余的字节数不足4096 ,剩余为：" + bis.available());
				byte[] remain = new byte[bis.available()];
				bis.read(remain);
				bos.write(remain);
			}
		}*/
		//bos = bis.;
		bis.close();
		bos.flush();
		bos.close();
		
		long end = System.currentTimeMillis();
		out.println("现在的结束时间毫秒是：" + end + " ms");
		long useTime = end - start;
		out.println("使用缓冲器--文件拷贝完成，总共用时：" + useTime + " ms");
	}

	private static void unUseBufferCopyFile(PrintStream out, File pdfFile, File pdfFile2)
			throws FileNotFoundException, IOException {
		FileInputStream iStream = new FileInputStream(pdfFile);
		FileOutputStream oStream = new FileOutputStream(pdfFile2);
		out.println("iStream.available() : " + ((double) iStream.available() / 1024 / 1024) + " MB");
		// 定义接收数据的数组
		byte[] unit = new byte[4096];// 数组的大小为4KB
		long start = System.currentTimeMillis();
		out.println("现在的开始时间毫秒是：" + start + " ms");
		while (iStream.available() > 0) {
			// while此处不能用read（）方法的返回值为-1，来判断，因为检查一次就执行一次读取，
			// 会导致复制后的文件比原来小，校验错误打不开
			if (iStream.available() >= 4096) {
				iStream.read(unit);
				oStream.write(unit);
			} else {
				// 说明剩余的字节数不足4096
				out.println("剩余的字节数不足4096 ,剩余为：" + iStream.available());
				byte[] remain = new byte[iStream.available()];
				iStream.read(remain);
				oStream.write(remain);
			}
		}
		iStream.close();
		oStream.close();
		long end = System.currentTimeMillis();
		out.println("现在的结束时间毫秒是：" + end + " ms");
		long useTime = end - start;
		out.println("文件拷贝完成，总共用时：" + useTime + " ms");
	}

}
