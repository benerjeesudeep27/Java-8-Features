package com.java8.features.revision.lambdaexp;

@FunctionalInterface
public interface I1 {
	public static final int AGE = 40;
	public String getMyDetails(String name, int age, String gender);
	static void write(String msg) {
		System.out.println(msg);
	}
}
