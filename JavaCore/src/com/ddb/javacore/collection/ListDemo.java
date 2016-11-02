package com.ddb.javacore.collection;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ddb.javacore.ood2.Human;

public class ListDemo {

	public static void main(String[] args) {
		List strList = new ArrayList<String>();
		List<String> strList2 = new ArrayList<String>();
		List<Integer> intList = new ArrayList<Integer>();
		List<Human> hmList = new ArrayList<Human>();
		
		strList2.add("I");
		strList2.add("am");
		strList2.add("dudongbin");
		
		PrintStream out = System.out;
		//打印list 长度
		out.println("strList.size() : " + strList.size());
		out.println("intList.size() : " + intList.size());
		out.println("hmList.size() : " + hmList.size());
		
		//List 添加元素
		out.println("strList 添加元素");
		strList.add("I ");
		strList.add("love");
		strList.add("China");
		strList.add("!");
		strList.add("!");
		out.println("strList.toString() : " + strList.toString());
		
		//List 删除元素
		out.println("strList 删除元素");
		strList.remove("!");
		out.println("strList.toString() : " + strList.toString());
		
		out.println("strList 删除指定位置元素");
		strList.remove(0);
		out.println("strList.toString() : " + strList.toString());
		
		out.println("strList 添加指定位置元素");
		strList.add(0, "I");
		out.println("strList.toString() : " + strList.toString());
		
		out.println("strList 设置指定位置元素");
		strList.set(3, " very much!");
		out.println("strList.toString() : " + strList.toString());
		
		out.println("strList 获取指定位置元素");
		out.println("strList.get(2) : " + strList.get(2));
		
		out.println("strList 是否为空");
		out.println("strList.isEmpty() : " + strList.isEmpty());
		
		out.println("strList.indexOf('love') : " + strList.indexOf("love"));
		
		out.println("strList.addAll(strList2) : " + strList.addAll(strList2));
		out.println("strList.toString() : " + strList.toString());
		out.println("strList.retainAll(strList2) : " + strList.retainAll(strList2));
		out.println("strList.toString() : " + strList.toString());
		
		out.println("strList.contains('am') : "+strList.contains("am"));
		out.println("strList.containsAll(strList2) : "+strList.containsAll(strList2));
		
		out.println("strList.equals(strList) : "+strList.equals(strList));
		
		out.println("strList.lastIndexOf('I') : "+	strList.lastIndexOf("I"));
	
		
		out.println(strList.subList(1, 4));
		out.println("strList.subList(1, 4) : " + strList.subList(1, 4));
		out.println("strList.subList(1, 4).toString() : " + strList.subList(1, 4).toString());
		Iterator<String> iterator= strList.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			out.println(object);
		}
		
		strList.clear();
		out.println("strList.clear() :");
		out.println(strList);
	}

}
