package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestingFilter3 {
	public static void main(String[] args) {
//		String str[] = {"Sudeep", "Pooja", "John", "Bhupinder", "Freddy", "Arun"};
//		Integer i[] = {2, 8, 9, 7, 5, 3};
//		Stream is not applied in String/ Integer type array
		List<String> names = Arrays.asList("Sudeep", "Pooja", "John", "Bhupinder", "Freddy", "Arun");
		List<String> name = names.stream().filter(s -> s.length()>=5 && s.length()<=6).collect(Collectors.toList());
		System.out.println(name);
		System.out.println("===============================");
		names.stream().filter(n -> n.length()>6 && n.length()<=9).forEach(n -> System.out.println(n+" "));
		System.out.println("===============================");
		names.stream().filter(n -> n.length()>3&& n.length()<5).forEach(System.out::println);
	}
}
