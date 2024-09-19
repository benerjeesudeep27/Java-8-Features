package com.java8.features.mockrevision;

import java.util.function.BiFunction;

public class BiFunctionDemo {
	public static float m1(int time) {
		float interest = 0.0f;
		BiFunction<Integer, Float, Float> bifn = (Integer principal, Float rate)->{
			return principal * rate * time;
		};
		interest = bifn.apply(500, 6.9f);
		return interest;
	}
	public static void main(String[] args) {
		float res = BiFunctionDemo.m1(5);
		System.out.println(res);
	}
}
