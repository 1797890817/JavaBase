package com.ddb.javacore.collection;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.ddb.javacore.ood2.Human;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		PrintStream out = System.out;
		LinkedList<Human> lList = new LinkedList<Human>();
		out.println("lList.size() :" + lList.size());
		lList.add(new Human("ID--001","zhansan"));
		lList.add(new Human("ID--002","lisi"));
		lList.add(new Human("ID--003","wangwu"));
		lList.add(new Human("ID--004","xiaoming"));
		lList.add(new Human("ID--005","laowang"));
		lList.add(new Human("ID--006","laosong"));
		out.println("lList.size() :" + lList.size());
		out.println("lList :" + lList);
		Human human = new Human("ID--007","xiaohong");
		lList.offer(human);
		out.println("lList.offer(human) 向尾部追加一个元素: " + lList);
		
		
		out.println("lList.peek() 获取首元素不删除:" + lList.peek());
		out.println("lList :" + lList);
		
		out.println("lList.pop()  获取并删除首元素:" + lList.pop());
		out.println("lList :" + lList);
		
		
		out.println("lList.poll()  获取并删除首元素:" + lList.poll());
		out.println("lList :" + lList);
		
		
		Iterator<Human> iterator =  lList.descendingIterator();
		out.println("lList.descendingIterator() : ");
		while (iterator.hasNext()) {
			Human human2 = (Human) iterator.next();
			out.println(human2);
		}
		//out.println(lList);
		
		Iterator<Human>  hmIterator = lList.iterator();
		out.println(" lList.iterator() : ");
		while (hmIterator.hasNext()) {
			Human human2 = (Human) hmIterator.next();
			out.println(human2);
			
		}
		
		out.println("lList.element() :" + lList.element());
		out.println("lList :" + lList);
		
		
	}

}
