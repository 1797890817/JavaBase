package com.ddb.javacore.enumdemo;

import java.io.PrintStream;

public class TestEnum {
	public static void print(WeekEnum we) {
		PrintStream out = System.out;
		switch (we) {
		case MONDAY:
			out.println("星期一   ");
			break;
		case TUESDAY:
			out.println("星期二  ");
			break;
		case WEDNESDAY:
			out.println("星期三  ");
			break;
		case THURSDAY:
			out.println("星期四   ");
			break;
		case FRIDAY:
			out.println("星期五   ");
			break;
		case SATURDAY:
			out.println("星期六   ");
			break;
		default:
			out.println("星期日   ");
			break;
		}
	}

	public static void print2(WeekEnum2 we) {
		PrintStream out = System.out;
		switch (we) {
		case MONDAY:
			out.println(we);
			PrintWeek(we, out);
			break;
		case TUESDAY:
			out.println(we);
			PrintWeek(we, out);
			break;
		case WEDNESDAY:
			out.println(we);
			PrintWeek(we, out);
			break;
		case THURSDAY:
			out.println(we);
			PrintWeek(we, out);
			break;
		case FRIDAY:
			out.println(we);
			PrintWeek(we, out);
			break;
		case SATURDAY:
			out.println(we);
			PrintWeek(we, out);
			break;
		default:
			out.println(we);
			PrintWeek(we, out);
			break;
		}
	}

	private static void PrintWeek(WeekEnum2 we, PrintStream out) {
		out.println(we.getIndex() +" ----"+ we.getDesc());
	}

	public static void main(String[] args) {
		//print(WeekEnum.MONDAY);
		/*
		 * print(WeekEnum.TUESDAY); print(WeekEnum.WEDNESDAY);
		 * print(WeekEnum.THURSDAY); print(WeekEnum.FRIDAY);
		 * print(WeekEnum.SATURDAY); print(WeekEnum.SUNDAY);
		 * */
		PrintStream out = System.out;
		print2(WeekEnum2.MONDAY);
		print2(WeekEnum2.TUESDAY);
		print2(WeekEnum2.WEDNESDAY);
		print2(WeekEnum2.THURSDAY);
		print2(WeekEnum2.FRIDAY);
		
		out.println("遍历打印枚举所有值 ：");
		for (WeekEnum2 string : WeekEnum2.values()) {
			PrintWeek(string, out);
		}
		
		
	}

}
