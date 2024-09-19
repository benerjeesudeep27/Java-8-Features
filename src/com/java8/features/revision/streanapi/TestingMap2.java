package com.java8.features.revision.streanapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestingMap2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("sudeep", "pooja", "aarti", "kapil", "ramesh");
		List<Integer> length = new ArrayList<>();
		//Before Java - 8
		for(String x : names) {
			length.add(x.length());
		}
		System.out.println(length);
		System.out.println("=============================");
		 //Using stream concept
		length = names.stream().map(x -> x.length()).collect(Collectors.toList());
		System.out.println(length);
	}
}
