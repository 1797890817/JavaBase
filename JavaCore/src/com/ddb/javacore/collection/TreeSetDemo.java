package com.ddb.javacore.collection;

import java.io.PrintStream;
import java.util.TreeSet;

import com.ddb.javacore.ood2.Human;

public class TreeSetDemo {

	public static void main(String[] args) {
		PrintStream out = System.out;
		TreeSet<Human> tSet = new TreeSet<Human>();
		out.println("tSet.size() :" + tSet.size());
		tSet.add(new Human("ID--01", 12));
		tSet.add(new Human("ID--02", 13));
		tSet.add(new Human("ID--03", 14));
		tSet.add(new Human("ID--04", 15));
		tSet.add(new Human("ID--05", 16));
		tSet.add(new Human("ID--06", 17));
		tSet.add(new Human("ID--07", 18));
		out.println("tSet.size() :" + tSet.size());
		out.println("tSet : " + tSet);

		Human human19 = new Human("ID000", 19);
		tSet.ceiling(human19);
		out.println("tSet.ceiling(new Human('ID000',19))  返回大于等于19的最小元素: " + tSet.ceiling(human19));

		Human human10 = new Human("ID000", 10);
		tSet.ceiling(human10);
		out.println("tSet.ceiling(new Human('ID000',10))  返回大于等于10的最小元素: " + tSet.ceiling(human10));

		Human human14 = new Human("ID000", 14);
		tSet.ceiling(human14);
		out.println("tSet.ceiling(new Human('ID000',14))  返回大于等于14的最小元素: " + tSet.ceiling(human14));

		out.println("tSet.floor(human19)  返回小于等于给定元素的最大值 ：" + tSet.floor(human19));
		out.println("tSet.floor(human10)  返回小于等于给定元素的最大值 ：" + tSet.floor(human10));
		out.println("tSet.floor(human14)  返回小于等于给定元素的最大值 ：" + tSet.floor(human14));

		out.println("tSet.first() : " + tSet.first());
		out.println("tSet.last() : " + tSet.last());

		out.println("tSet.headSet(human14)  返回严格小于给定元素的Set集合: " + tSet.headSet(human14));
		out.println("tSet.tailSet(human14)  返回严格大于等于给定元素的Set集合: " + tSet.tailSet(human14));

		out.println("tSet.tailSet(human14,false)  返回严格大于给定元素的Set集合: " + tSet.tailSet(human14, false));
		out.println("tSet.tailSet(human14,true)  返回严格大于给定元素的Set集合: " + tSet.tailSet(human14, true));

		TreeSet<Human> tSet2 = (TreeSet<Human>) tSet.clone();
		out.println("tSet2 : " + tSet2);
		out.println("tSet : " + tSet);
		out.println("修改tSet2 ： ");
		for (Human human : tSet2) {
			human.setAge(25);
		}
		out.println("tSet2 : " + tSet2);
		out.println("tSet : " + tSet);
		
	}

}
