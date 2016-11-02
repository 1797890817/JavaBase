package com.ddb.javacore.collection;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Long, Integer> hMap = new HashMap<Long, Integer>();
		PrintStream out = System.out;
		out.println("hMap.size() :" + hMap.size());
		hMap.put(11L, 111);
		hMap.put(12L, 112);
		hMap.put(13L, 113);
		hMap.put(14L, 114);
		hMap.put(15L, 115);
		hMap.put(11L, 119);
		out.println("hMap : " + hMap);
		
		Set<Map.Entry<Long,Integer>> hSetEntrys = hMap.entrySet();
		out.println("Map -----> Key : Value");
		for (Entry<Long, Integer> entry : hSetEntrys) {
			out.println("entry : " + entry);
			out.println(entry.getKey() + " = " + entry.getValue());
		}
		out.println("-------------------------------------------------");
		for (Entry<Long, Integer> entry : hMap.entrySet()) {
			out.println("entry : " + entry);
			out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		
		out.println("hMap.get(14) : " +hMap.get(14L));
		
		//hMap.keySet()
		out.println("out all keys :");
		for (Long key : hMap.keySet()) {
			out.println(key);
		}
		
		out.println("hMap.containsKey(18) : " + hMap.containsKey(18));
		out.println("hMap.containsKey(13) : " + hMap.containsKey(13));
		out.println("hMap.containsKey(13L) : " + hMap.containsKey(13L));
		
		out.println("hMap.containsValue(120) : " + hMap.containsValue(120));
		out.println("hMap.containsValue(115) : " + hMap.containsValue(115));
		out.println("hMap.containsValue(115L) : " + hMap.containsValue(115L));
		out.println("hMap.containsValue((byte)115L) : " + hMap.containsValue((byte)115));
		
		out.println("删除映射");
		hMap.remove(11L);
		out.println(hMap);
		hMap.replace(15L, 150);
		out.println("hMap.replace(15L, 150) 后: " + hMap);
		//out.println("hMap.replace(15L, 150) 后: " + hMap.replace(15L, 150));
		
		hMap.replace(15L, 150, 175);
		out.println("hMap.replace(15L, 150, 175) 后: " + hMap);
		out.println("hMap.values() :");
		for (Integer entry : hMap.values()) {
			out.println(entry);
		}
		
		hMap.clear();
		out.println("hMap.clear() : "+hMap);
	}

}
