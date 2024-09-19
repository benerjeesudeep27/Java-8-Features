package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RevStreamMethod_6 {
	public static void main(String[] args) {
		// anyMathch
		List<String> names = Arrays.asList("Sudeep", "Kapel", "Dev1", "Dev2", "Keran", "Sudeep");
		boolean res = names.stream().anyMatch(x -> x.contains("Sudeep"));
		System.out.println(res);
		boolean res2 = names.stream().anyMatch(x -> x.startsWith("K"));
		 System.out.println(res2);
		 
		 //allMatch
		 boolean res3 =  names.stream().allMatch(x -> x.contains("d"));
		 System.out.println(res3);
		 boolean res4 = names.stream().allMatch(x -> x.matches("[A-Za-z]+"));
		 System.out.println(res4);
		 
		 //noneMatch
		boolean res5 =  names.stream().noneMatch(x -> x.matches("\\d+")); 
		System.out.println("Res5 :"+res5);
		
		//findFirst
		Optional<String> res6 = names.stream().filter(x -> x.startsWith("D")).findFirst();
		System.out.println(res6.get());
		
		//findAny
		Optional<String> res7 = names.stream().filter(x -> x.startsWith("K")).findAny();
		System.out.println(res7.get());
		
		System.out.println("***************************************");
		//Concat
		List<String> list1 = Arrays.asList("Sudeep","Pragya", "Pooja","Hemant");
		List<String> list2 = Arrays.asList("Jiya", "Keshav", "Ravi");
		Stream<String> s1 = list1.stream();
		Stream<String> s2 = list2.stream();
		Stream.concat(s1, s2).forEach(System.out::println);
		List<String> finalList = Stream.concat(s1, s2).collect(Collectors.toList());
		System.out.println(finalList);
		System.out.println("------------------------");
		
		
		
	}
}
