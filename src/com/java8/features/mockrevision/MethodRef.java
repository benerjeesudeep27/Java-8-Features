package com.java8.features.mockrevision;

@FunctionalInterface
interface Eligible {
	void findEligibility(int age, float marks);
}

public class MethodRef {
	public static void yourEligibility(int age, float marks) {
		if (age >= 14 && marks >= 75.0f) {
			System.out.println("You are eligible");
		} else
			System.out.println("You are not eligible");
	}

	public static void main(String[] args) {
		Eligible e = MethodRef :: yourEligibility;
		e.findEligibility(13, 80.f);
	}
}
