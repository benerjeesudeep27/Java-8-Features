package com.java8.features.mockrevision;

import java.util.HashMap;
import java.util.function.Function;

public class FunctionDemo {
	private static HashMap<Integer, String> hm = new HashMap<>();
	public static String add(Integer a, String b) {
		if(hm.containsKey(a)) {
			return "Already Present";
		}else {
			hm.put(a, b);
		}
		return "Data added successfully";
	}
	public static void adding() {
		FunctionDemo.add(1, "Pooja");
		FunctionDemo.add(2, "Sudeep");
		FunctionDemo.add(3, "Deepak");
		FunctionDemo.add(4, "Kiran");
		FunctionDemo.add(5, "Rohan");
	}
	public static String find(int k) {
		String status ="Invalid Key";
		Function<Integer, String> fn = (Integer key)->{
			if(hm.containsKey(key)) {
				return hm.get(key);
			}else {
				return status;
			}
		};
		return fn.apply(k);
	}
	public static void main(String[] args) {
		FunctionDemo.adding();
		System.out.println(FunctionDemo.find(5));
	}
}
