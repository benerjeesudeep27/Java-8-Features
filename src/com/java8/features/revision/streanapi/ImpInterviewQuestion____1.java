package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;

public class ImpInterviewQuestion____1 {

	public static void main(String[] args) {
		//Way 1
		List<String> list = Arrays.asList("A","2","C","3","D","1","B");
		list.stream().filter(x -> x.matches("[A-Za-z]")).sorted().forEach(System.out::println);
		System.out.println("---------------------------------");
		list.stream().filter(x -> x.matches("\\d")).sorted().forEach(System.out::println);
		System.out.println("*******************************");
		//Way-2
		String str[] = {"A","2","C","3","D","1","B"};
		Arrays.stream(str).filter(x -> x.matches("[A-Za-z]")).forEach(System.out::println);
		Arrays.stream(str).filter(x -> x.matches("\\d")).forEach(System.out::println);
	}

}
