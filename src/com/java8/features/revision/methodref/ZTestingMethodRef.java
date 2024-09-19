package com.java8.features.revision.methodref;

import java.util.function.BiFunction;

public class ZTestingMethodRef {
	public String getEligibility(int age, float marks) {
		String result = null;
		if(age > 14 && marks > 75.0f) {
			result =  "You age eligible for the HeadBoy";
		}else {
			result = "You are not eligible for the HeadBoy";
		}
		return result;
	}
	public void getMyDetails(String name, int age, String gender) {
		System.out.println("Your name is : "+name);
		System.out.println("Your gender is : "+gender);
		System.out.println("Your age is : "+age);
	}
	public static void main(String[] args) {
		ZTestingMethodRef zref = new ZTestingMethodRef();
		BiFunction<Integer, Float, String> bifunc = zref::getEligibility;
		Z1 z = zref::getMyDetails;
		String res = bifunc.apply(15, 45.2f);
		System.out.println(res);
		System.out.println("===========================");
		z.getDetails("Pooja", 35, "Female");
	}
}
