package com.java8.features.revision.streanapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestingFlatMap2 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		List<Integer> l2 = new ArrayList<>();
		l2.add(4);
		l2.add(5);
		List<Integer> l3 = new ArrayList<>();
		l3.add(6);
		l3.add(7);
		l3.add(8);
		List<List<Integer>> mainList = Arrays.asList(l1, l2, l3);
		
		List<Integer> list = mainList.stream().flatMap(ml -> ml.stream().map(x -> x + 2)).collect(Collectors.toList());
		System.out.println(list);
		mainList.stream().flatMap(ml -> ml.stream()).filter(x -> x % 2 == 0).forEach(System.out::println);
	}

}
