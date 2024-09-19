package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RevStreamMethods_2 {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Anurag", "Deepak", "Kishore", "Anurag", "Sahil", "Kishore");
		List<String> distNames = nameList.stream().distinct().collect(Collectors.toList());
		System.out.println(distNames);
		System.out.println("-------------------------------");
		nameList.stream().distinct().limit(2).forEach(System.out::println);
		long num = nameList.stream().distinct().count();
		System.out.println(num);
	}

}
