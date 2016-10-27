package com.ddb.javacore.ood2;

public class Farmer extends Human {
	private String id;
	private String name;
	private Integer age;
	static String WORK = "WORKING";

	/**
	 * @return the wORK
	 */
	public static String getWORK() {
		return WORK;
	}

	/**
	 * @param wORK
	 *            the wORK to set
	 */
	public static void setWORK(String wORK) {
		WORK = wORK;
	}

	public static void work() {
		System.out.println("I'm Farmer , I'm working!");

	}

	public static void main(String[] args) {
		System.out.println(Farmer.WORK);
		Farmer.work();
		Farmer farmer = new Farmer();
		Farmer.setWORK("************");
		System.out.println(Farmer.WORK);

	}

}
