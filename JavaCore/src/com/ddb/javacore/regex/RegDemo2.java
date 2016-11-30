package com.ddb.javacore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegDemo2 {
	public static void main(String args[]) {
		Matcher matcher = Pattern.compile("(\\d+)", Pattern.CASE_INSENSITIVE).matcher("1234,56,896,478");
		int groupCount = matcher.groupCount();
		while (matcher.find()) {
			System.out.println("matcher.group():" +matcher.group());
			for (int i = 0; i <= groupCount; i++) {
 				System.out.println(matcher.group(i));
			}
			System.out.println("-----");

		}
	}
}
