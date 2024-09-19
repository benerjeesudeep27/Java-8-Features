package com.java8.features.revision.lambdaexp;

import java.util.HashMap;
import java.util.function.Function;

public class TestingFunction {
	private static HashMap<Integer, String> emp = new HashMap<>();
	public static String addEmployee(int id, String name) {
		if(emp.containsKey(id)) {
			return "Already Present";
		}else {
			emp.put(id, name);
		}
		return "Employee Added Successfully";
	}
	public static void main(String[] args) {
		Function<Integer, String> id = (Integer i)-> {
			if(emp.containsKey(i)){
				return emp.get(i);
			}else 
				return "Invalid Id";
		};
		addEmployee(1, "Sudeep");
		addEmployee(2, "Pooja");
		addEmployee(3, "Aarti");
		addEmployee(4, "Vikas");
		System.out.println(id.apply(1));
	}
}
