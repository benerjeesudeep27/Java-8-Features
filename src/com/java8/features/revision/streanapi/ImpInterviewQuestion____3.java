package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImpInterviewQuestion____3 {
	public static void main(String[] args) {
		//No Problem with perform multiple operation on list converted to stream
		List<String> list = Arrays.asList("Deepak","Sudeep","Keshav","Ravi","Kiran","Pooja","Anil","Deep");
		List<String> finalList = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(finalList);
		
		list.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
		System.out.println("-------------------");
		list.stream().filter(x -> x.startsWith("D")).forEach(System.out::println);
		System.out.println("-------------------");
		Optional<String> res = list.stream().filter(x -> x.startsWith("K")).findFirst();
		System.out.println(res.get());
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		//
		List<String> list1 = Arrays.asList("Deepak","Sudeep","Keshav","Ravi");
		List<String> list2 = Arrays.asList("Kiran","Pooja","Anil","Deep");
		Stream<String> s1 = list1.stream();
		Stream<String> s2 = list2.stream();
		List<String> listt = s1.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(listt);
		s1.filter(x -> x.startsWith("R")).map(s -> s.toUpperCase()).forEach(System.out::println);
		
	}

}
