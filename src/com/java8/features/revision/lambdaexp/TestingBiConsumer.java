package com.java8.features.revision.lambdaexp;

import java.util.function.BiConsumer;

public class TestingBiConsumer {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Waiting...");
		Thread.sleep(1500);
		BiConsumer<String, Integer> bicon = (String name, Integer age) -> {
			System.out.println("My name is "+name+" and my age is "+age);
		};
		bicon.accept("Aarti", 23);
	}

}
