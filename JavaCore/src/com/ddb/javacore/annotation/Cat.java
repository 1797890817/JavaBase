package com.ddb.javacore.annotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat {
	@Override
	public String toString() {
		return "Cat [name=" + name + ", desc=" + desc + "]";
	}

	@HelloWorld
	private String name;
	private String desc;

}
