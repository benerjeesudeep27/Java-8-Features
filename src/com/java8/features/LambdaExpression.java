package com.java8.features;
interface People{
	void m1();
//	int m2();
//	String m3();
}
public class LambdaExpression {
	
	public static void main(String[] args) {
		People p1 = ()->{
			System.out.println("Tell us about yourself");
		};
		p1.m1();
	}
	
}
 interface infra{
	 String name(String firstName, byte age);
 }
 class FullName{
	 public static void main(String[] args) {
		infra in = (myFirstName, myAge)->{
			return "My first name is "+ myFirstName+". My age is "+myAge;
		};
		String name = in.name("Sudeep", (byte)28);
		System.out.println(name);
	}
 }
 
 
 class Main{
	 
	 public static void main(String[] args) {
		 pain("A");
		System.out.println("Sudeep Banerjee");
	}
	 public static void pain(String arg) {
		 String [] str = {"A", "B", "C"};
		 main(str);
		System.out.println("Pooja Mahato");
	}
 }