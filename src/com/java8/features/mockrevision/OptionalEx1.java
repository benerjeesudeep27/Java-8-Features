package com.java8.features.mockrevision;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx1 {
	public static void main(String[] args) {
		String s[] = new String[10];
		s[2] = "Sudeep";
		System.out.println(s[6]);
		Optional<String> op = Optional.ofNullable(s[2]);
		System.out.println(op);
		if(op.isPresent()) {
			System.out.println(op);
		}else {
			System.out.println("There is no value");
		}
		op.ifPresent(k -> System.out.println(k));
		op.ifPresent(System.out::println);
	}
}
