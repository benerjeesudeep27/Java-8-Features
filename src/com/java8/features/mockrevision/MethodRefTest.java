package com.java8.features.mockrevision;

public class MethodRefTest {
	public static String myDetails(String name, int age, String city) {
		return "My name is "+name+" i am "+age+" and i am from "+city;
	}
	public static void main(String[] args) {
		In in = (String name, int age, String city)->{
			return "My name is "+name+" i am "+age+" and i am from "+city;
		};
		 String res = in.myDetails("Akash", 20, "Noida");
		System.out.println(res);
		System.out.println("===============Method Ref==============");
		In in1 = MethodRefTest::myDetails;
		String res1 = in1.myDetails("Kavita", 30, "Delhi");
		System.out.println(res1);
	}
}
