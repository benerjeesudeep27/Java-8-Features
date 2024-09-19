package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RevStreamMethods_3 {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(7,8,4,2,9,6,1);
		Optional<Integer> min = num.stream().min((val1, val2) -> val1.compareTo(val2));
		System.out.println(min.get());
		
		System.out.println("--------------------------");
		Optional<Integer> max = num.stream().max((val1, val2)-> val1.compareTo(val2));
		System.out.println(max.get());
	}
}
