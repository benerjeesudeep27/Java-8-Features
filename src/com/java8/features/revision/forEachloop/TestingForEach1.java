package com.java8.features.revision.forEachloop;

import java.util.ArrayList;
import java.util.List;

public class TestingForEach1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sudeep");
		list.add("Pooja");
		list.add("Kartik");
		list.add("Divya");
		list.add("Suman");
		list.forEach(names -> System.out.println(names)); // Lambda Expression
		System.out.println("\n===============================");
		list.forEach(System.out::println); // Method Reference
	}
}
