package com.java8.features.revision.optional;

import java.util.Optional;

public class TestingOptional5 {
	public static void main(String[] args) {
		String s[] = new String[10];
		s[5] = "Hello, How are you ?";
		Optional<String> op1 = Optional.of(s[5]);
		Optional<String> op2 = Optional.empty();
		System.out.println("1 --"+op1.filter(x-> x.equals("abc")));
		System.out.println("2 --"+op1.filter(y-> y.equals("Hello, How are you ?")));		
	}
}
