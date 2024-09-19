package com.java8.features.mockrevision;

import java.util.function.Supplier;

@FunctionalInterface
interface KK {
	String performConcatinate(String msg);
}

public class LambdaExp2 {
	public static void main(String[] args) {
		String name = args[0];
		Supplier<String> con = () -> {
			return "Welcome " + name;
		};
		System.out.println(con.get());
	}
}
