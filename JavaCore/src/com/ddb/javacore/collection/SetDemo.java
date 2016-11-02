package com.ddb.javacore.collection;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ddb.javacore.ood2.Human;

public class SetDemo {

	public static void main(String[] args) {
		PrintStream out = System.out;
		
		Set<Integer> intSet = new HashSet<Integer>();
		Set<String> strSet = new HashSet<String>();
		Set<Human> hmSet = new HashSet<Human>();
		out.println("intSet 添加元素前：" + intSet);
		out.println("intSet.size() :" + intSet.size());
		intSet.add(10);
		intSet.add(11);
		intSet.add(12);
		intSet.add(13);
		
		out.println("intSet 添加元素后：" + intSet);
		out.println("intSet.size() :" + intSet.size());
		
		intSet.add(11);
		intSet.add(18);
		intSet.add(15);
		intSet.add(9);
		out.println("intSet 添加元素<11>后：" + intSet);
		out.println("intSet.size() :" + intSet.size());
		out.println("for each HashSet Start:");
		for (Integer is : intSet) {
			out.println(is);
		}
		out.println("for each HashSet End:");
		
		
		intSet.remove(15);
		out.println("intSet remove<15>后：" + intSet);
		
		out.println("intSet.toArray() : " + intSet.toArray());
		out.println("intSet : " + intSet);
		Object[] objects=  intSet.toArray();
		for (Object object : objects) {
			out.println(object);
		}
		
		Integer[] y = intSet.toArray(new Integer[2]);
		out.println("intSet.toArray(new String[2]) :");
		for (Integer str: y) {
			out.println(str);
		}
		
		out.println("intSet.toArray() : " + intSet.toArray());
		out.println("intSet : " + intSet);
		//intSet.to
		
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 1; i <=15; i++) {
			intList.add(i + 10);
		}
		intList.add(11);
		intList.add(11);
		intList.add(11);
		intList.add(11);
		intList.add(11);
		intList.add(11);
		out.println("intList :" + intList);
		List<Integer> intList2 = new ArrayList<Integer>();
		intList2.add(11);
		out.println("intList.removeAll(intList2) :" + intList.removeAll(intList2));
		out.println("intList :" + intList);
		
		/*intList.removeAll(intSet);
		out.println("intList :" + intList);*/
	}

}
