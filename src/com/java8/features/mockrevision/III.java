package com.java8.features.mockrevision;
@FunctionalInterface
public interface III {
	String myDetails(String name, int age, String city);
}
class AB{
	
	public static void main(String[] args) {
		III iii = (String name, int age, String city)->{return "My name is "+name+"and my age is "+age+" and i am form "+city;};
		String res=iii.myDetails("Sudeep", 30, "Shimla");
		System.out.println(res);
	}
}