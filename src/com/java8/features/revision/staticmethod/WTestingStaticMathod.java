package com.java8.features.revision.staticmethod;

public class WTestingStaticMathod implements U2{
	public static void main(String[] args) {
		U1.getAllDetails();
		U1.getAge(45);
		U1.getGender('M');
		String s1 = U1.getName("Sudeep");
		System.out.println(s1);
		System.out.println("-----------------------------");
		U2.getMyDetails();
	}

}
