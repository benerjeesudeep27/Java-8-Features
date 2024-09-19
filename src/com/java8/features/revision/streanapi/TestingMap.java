package com.java8.features.revision.streanapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestingMap {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("sudeep", "pooja", "aarti", "kapil", "ramesh");
		List<String> name = new ArrayList<>();
		//Before java 8
		for(String n : names) {
			name.add(n.toUpperCase());
		}
		System.out.println(name.hashCode());
		
		System.out.println("-----------------------------");
		//Using Streams
		name = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(name.hashCode());
		int i = 10;
		i = 10 + 10;
		System.out.println(i);
		System.out.println("-------------");
		i = 100;
		System.out.println(i);
		String s = new String("abcd");
		System.out.println(s.hashCode());
		s = "efgh";
		System.out.println(s.hashCode());
	}
}
