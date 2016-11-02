package com.ddb.javacore.enumdemo;

import lombok.Getter;
import lombok.Setter;

public enum WeekEnum2 {
	MONDAY(2, "星期一"), TUESDAY(3, "星期二"), WEDNESDAY(4, "星期三"), THURSDAY(5, "星期四"), FRIDAY(6, "星期五"), SATURDAY(7,
			"星期六"), SUNDAY(1, "星期日");

	@Getter
	@Setter
	private String desc;
	@Getter
	@Setter
	private Integer index;

	private WeekEnum2(Integer index, String desc) {
		this.desc = desc;
		this.index = index;
	}

	private WeekEnum2() {

	}

	private WeekEnum2(String desc) {
		this.desc = desc;
	}

}
