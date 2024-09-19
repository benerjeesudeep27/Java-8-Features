package com.java8.features.revision.optional;

import java.util.Optional;

public class TestingOptional3 {
	public static String getDefaultString(String msg) {
		return msg;
	}
	public static void main(String[] args) {
		Optional<String> op1 = Optional.of("Hello, how are you ?");
		Optional<String> op2 = Optional.empty();
//		Optional<String> op2 = Optional.of(null);   // NullPointerException
		op1.ifPresent(s -> System.out.println(s));
		System.out.println("1 --"+op1.orElse(getDefaultString("Hey Baby")));
		System.out.println("2 --"+op2.orElse(getDefaultString("Hey Baby")));
		System.out.println("\n==========================\n");
		System.out.println("3 --"+op1.orElseGet(() -> getDefaultString("Hey You")));
		System.out.println("4 --"+op2.orElseGet(() -> getDefaultString("Hey You")));
	}
}
