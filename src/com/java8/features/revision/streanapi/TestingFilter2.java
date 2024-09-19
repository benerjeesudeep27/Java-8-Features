package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestingFilter2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sudeep", "Pooja", null, "Aarti", "Hemant", null, "Vikas");
		List<String> name =names.stream().filter(n -> n != null).collect(Collectors.toList());
		System.out.println(name);
		System.out.println("=================================");
		names.stream().filter(n -> n != null).forEach(System.out::println);
		System.out.println("=================================");
		names.stream().filter(n -> n != null).forEach(x -> System.out.print(x+" "));
	}
}
