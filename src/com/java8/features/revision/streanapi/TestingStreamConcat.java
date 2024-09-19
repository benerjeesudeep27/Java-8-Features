package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestingStreamConcat {
	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("Sudeep","Pooja","Aarti","Vikas","Hemant");
		List<String> l2 = Arrays.asList("Eagle","Snake","Cow","Dog","Cat");
		Stream<String> s1 = l1.stream();
		Stream<String> s2 = l2.stream();
		List<String> l =Stream.concat(s1, s2).collect(Collectors.toList());
		l.forEach(x -> System.out.print(x+ " "));
		System.out.println("-------------------------------------------");
		List <Integer> num = Arrays.asList(5, 8, 9, 7, 3, 4);
		Stream s3 = num.stream();
//		Stream.concat(l1, num); Not Possible String concat with integer
	}
}
