package com.java8.features.revision.functionalinterface;

@FunctionalInterface
public interface ObjClassFunctionalInterface {
	public void showDetails(String name, int age, char gender);
	default int findMultiple(int a, int b) {
		int mul = a * b;
		return mul;
	}
	static boolean isNonVegetarian(String foodName) {
		boolean flag = false;
		if(foodName.equalsIgnoreCase("Egg") || foodName.equalsIgnoreCase("Chicken") || foodName.equalsIgnoreCase("Mutton")) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}
	boolean equals(Object obj);
	int hashCode();
	String toString();
	
}
