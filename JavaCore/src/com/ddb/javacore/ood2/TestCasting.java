package com.ddb.javacore.ood2;

public class TestCasting {

	public static void main(String[] args) {
		Human human1 = new Police();
		Human human2 = new Worker();
		
		Police police = (Police)human1;
		System.out.println(police);
		Farmer farmer= (Farmer) human2;
		System.out.println(farmer);
		
	}

}
