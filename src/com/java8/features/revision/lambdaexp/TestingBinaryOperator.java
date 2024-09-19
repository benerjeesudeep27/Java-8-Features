package com.java8.features.revision.lambdaexp;

import java.util.function.BinaryOperator;

public class TestingBinaryOperator {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Waiting...");
		Thread.sleep(1500);
		BinaryOperator<String> biop = (String name, String age)->{
			return "My name is "+name+" and my age is "+age;
		};
		System.out.println(biop.apply("Sudeep Banerjee", "28"));
	}
}
