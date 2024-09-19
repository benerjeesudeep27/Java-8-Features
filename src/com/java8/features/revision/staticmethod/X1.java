package com.java8.features.revision.staticmethod;

public interface X1 {
	static void myDetails(String name, int age, char gender) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}
}
