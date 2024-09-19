package com.java8.features.revision.functionalinterface;
@FunctionalInterface
public interface I5 {
	int a = 10;
	int b = 20;
	static String name = "Sudeep";
//	private String gender = "Male"; From Java - 9
	
	int getDetails(int a, String b);
}
