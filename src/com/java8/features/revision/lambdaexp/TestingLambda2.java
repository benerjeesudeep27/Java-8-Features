package com.java8.features.revision.lambdaexp;

public class TestingLambda2 {
	public static void main(String[] args) {
		System.out.println("Please show my details :- ");
		I1 i = (String n, int a, String g) -> {
			return "My name is "+n+" I am a "+g+" & I am "+a;
		};
		String details = i.getMyDetails("Pooja", 26, "female");
		System.out.println(details);
		I1.write("Love you all");
		I2 ii = (int a, int b) -> a+b;
		System.out.println(ii.findsum(25, 50));
	}
}
