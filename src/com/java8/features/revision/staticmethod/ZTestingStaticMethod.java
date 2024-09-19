package com.java8.features.revision.staticmethod;

public class ZTestingStaticMethod implements X1, X2{

	public static void main(String[] args) {
		X1.myDetails("Pooja Mahato", 26, 'F');
		System.out.println("-------------------------");
		String detail = X2.myDetails("Sudeep Banerjee", 28, 'M');
		System.out.println(detail);
		System.out.println("-------------------------");
		String name = ZTestingStaticMethod.myDetails("Aarti Mahato", 23, 'F');
		System.out.println(name);
	}
	public static String  myDetails(String name, int age, char gender) {
		return "Name : "+name+" Age :  "+age+" Gender : "+gender;
	}
}
