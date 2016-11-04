package com.ddb.javacore.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.ddb.javacore.ood2.Human;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		PrintStream out = System.out;
		File file = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "test4.txt");
		// 写入对象数据
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		List<Human> list = new ArrayList<Human>();

		Human human = new Human("ID---0001", 30);
		Human human2 = new Human("ID---0002", 31);
		Human human3 = new Human("ID---0003", 32);
		Human human4 = new Human("ID---0004", 33);
		list.add(human);
		list.add(human2);
		list.add(human3);
		list.add(human4);

		// oos.writeObject(human);
		oos.writeObject(list);
		oos.close();
		os.close();

		out.println(human);

		// 读取对象数据
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(is);

		// Human human2 = (Human) ois.readObject();
		List<Human> list2 = (List<Human>) ois.readObject();
		ois.close();
		is.close();
		out.println("读取 human2 : " + list2);

	}

}
