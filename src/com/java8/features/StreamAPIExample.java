package com.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamAPIExample {
	public static void allEven(List<Integer> l) {
		for (Integer i : l) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(4);
		l1.add(5);
		l1.add(7);
		l1.add(9);
		l1.add(6);
		l1.add(8);
		// allEven(l1);

		// Using stream:-
		Stream<Integer> s = l1.stream();
		List<Integer> l = s.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l);

		Stream<Integer> s1 = Stream.empty();
		s1.forEach(e -> {
			System.out.println("E : " + e);
		});
		Stream<String> s2 = Stream.of("Sudeep", "Pooja", "Keya", "Tapas", "Aarti", "Vikas");
		List<String> list = s2.filter(f -> f.contains("oo")).collect(Collectors.toList());
		System.out.println(list);
		System.out.println("-----------------------------------");

		// Builder :-
		Stream<Object> s3 = Stream.builder().build();

		// For Arrays:-
		long arr[] = new long[9];
		LongStream s4 = Arrays.stream(arr);
		s4.forEach(r -> {
			System.out.println(r);
		});

		// For Arrays:-
		double a[] = new double[9];
		DoubleStream s5 = Arrays.stream(a);
		s5.forEach(r -> {
			System.out.println(r);
		});
	}
}


class StreamMethods{
	public static void main(String[] args) {
		//filter(predicate):-
		
		
		//map(function) :-  used to perform any operation to each element
	}
}
