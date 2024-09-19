package com.java8.features.revision.staticmethod;

public interface U1 {
	static String getName(String name) {
		return name;
	}
	static int getAge(int age) {
		return age;
	}
	static char getGender(char gender) {
		return gender;
	}
	static void getAllDetails() {
		String name = getName("Sudeep Banerjee");
		int age = getAge(28);
		char gender = getGender('M');
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}
}
