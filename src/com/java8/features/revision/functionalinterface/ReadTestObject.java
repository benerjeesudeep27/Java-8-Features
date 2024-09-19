package com.java8.features.revision.functionalinterface;

public class ReadTestObject implements ObjClassFunctionalInterface{

	public static void main(String[] args) {
	ObjClassFunctionalInterface read = new ReadTestObject();
		read.showDetails("Sudeep", 28, 'M');
		System.out.println(read.toString());
	}

	@Override
	public void showDetails(String name, int age, char gender) {
		String myname = name;
		int myage = age;
		char mygender = gender;
		System.out.println(myname);
		System.out.println(myage);
		System.out.println(mygender);
	}
	
	@Override
	public String toString() {
		return "Sudeep Banerjee";
	}
	
	@Override
	public boolean equals(Object o) {
		return false;
	}
}
