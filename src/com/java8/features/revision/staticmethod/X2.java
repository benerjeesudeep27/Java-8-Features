package com.java8.features.revision.staticmethod;

public interface X2 {
	static String  myDetails(String name, int age, char gender) {
		String detail = name+" "+age+" "+gender;
		return detail;
	}
}
