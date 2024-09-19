package com.java8.features.revision.streanapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestingFlatMap1 {
	public static void main(String[] args) {
//		Creating list 1
		List<String> list1 = new ArrayList<>();
		list1.add("Sudeep");
		list1.add("Pooja");
		list1.add("Aarti");
//		creating list 2
		List<String> list2 = new ArrayList<>();
		list2.add("Divya");
		list2.add("Amit");
		list2.add("Chetan");
//		Creating Main list containing above lists
		List<List<String>> mainList = Arrays.asList(list1, list2);
		
//		Before java - 8
		for(List<String> l : mainList ) {
			for(String v : l) {
				System.out.print(v+" ");
			}
		}
		System.out.println();
		System.out.println("=============================");
		//Using Stream API
		List<String> names = mainList.stream().flatMap(ml -> ml.stream()).collect(Collectors.toList());
		System.out.println(names);
		mainList.stream().flatMap(ml -> ml.stream()).map(x -> x.toUpperCase()).forEach(System.out::println);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		mainList.stream().flatMap(ml -> ml.stream().map(x -> x.toUpperCase())).forEach(System.out::println);
	}
}
