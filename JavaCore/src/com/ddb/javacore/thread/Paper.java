package com.ddb.javacore.thread;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Paper {
	private String name = "I'm Paper!";
	private String owner; // 对象的拥有者
	private Boolean isPrivated = false;// 是否被占有

}
