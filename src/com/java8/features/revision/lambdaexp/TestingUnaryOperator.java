package com.java8.features.revision.lambdaexp;

import java.util.function.UnaryOperator;

public class TestingUnaryOperator {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Waiting...");
		Thread.sleep(1500);
		System.out.println("This is the usage of UnaryOperator");
		UnaryOperator<Integer> u = (Integer i)->{
			i = i * i;
			return i;
		};
		System.out.println(u.apply(15));
	}
}
