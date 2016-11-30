package com.ddb.javacore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegDemo {
	public static void main(String args[]) {
		Matcher matcher = Pattern.compile("t(a|oo)*n", Pattern.CASE_INSENSITIVE).matcher("atoonatoonbtancctn33");
		int groupCount = matcher.groupCount();
		while (matcher.find()) {
			for (int i = 0; i <= groupCount; i++) {
				System.out.println(matcher.group(i));
			}
			System.out.println("-----");

		}
	}
}
