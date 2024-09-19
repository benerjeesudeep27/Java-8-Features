package com.java8.features.revision.streanapi;

import java.util.Arrays;

public class ImpInterviewQuestion____2 {

	public static void main(String[] args) {
		String str[] = {"Sudeep", "Pooja", "45126", "Kapil","7845", "1", "aa", "Z"};
		Arrays.stream(str).filter(x -> x.matches("[A-Za-z]+")).forEach(System.out::println);
		System.out.println("=======================");
		Object arr[] = Arrays.stream(str).filter(x -> x.matches("\\d+")).toArray();
		for(Object a : arr) {
			System.out.println(a);
		}
	}
}
