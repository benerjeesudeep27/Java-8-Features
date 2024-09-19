package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;

public class RevStreamMethods {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Sudeep", "Pooja", "Kartik", "Shyama", "Tejasvi");
		
		nameList.stream().map(x -> x.toUpperCase()).filter(c -> c.length() ==6).forEach(System.out::println);
	}
}
