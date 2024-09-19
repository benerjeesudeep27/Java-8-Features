package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestingFilter1 {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(5, 7, 8, 2, 6, 9, 4);
		List<Integer> evenNum = num.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		System.out.print(evenNum+" ");
		System.out.println("\n============================\n");
		num.stream().filter(n -> n%2 != 0).forEach(n -> System.out.print(n+" ")); //Lambda Exp
		System.out.println("\n============================\n");
		num.stream().filter(n -> n%2 != 0).forEach(System.out::println); //Method ref
	}

}
