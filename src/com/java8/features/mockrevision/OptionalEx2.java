package com.java8.features.mockrevision;

import java.util.Optional;

public class OptionalEx2 {
	static int getDefaultInteger(int in) {
		return in;
	}
	public static void main(String[] args) {
		Integer in[] = new Integer[20];
		in[5] = 85;
		in[7] = 52;
		Optional<Integer> op = Optional.of(in[5]);
		System.out.println(op.filter(s -> s.equals(75)));
		Optional<Integer> op1 = Optional.ofNullable(in[11]);
//		System.out.println(op1.orElseThrow(()-> new ArithmeticException())); //Very Important
		System.out.println(op1.orElse(op.get()));
	}
}
