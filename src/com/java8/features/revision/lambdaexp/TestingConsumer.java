package com.java8.features.revision.lambdaexp;

import java.util.function.Consumer;

public class TestingConsumer {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Waiting...");
		Thread.sleep(1500);
		Consumer<String> con = (String name) -> {
			System.out.println("Thank you for learning Java 8 features "+name);
		};
		con.accept("Sudeep Banerjee");
	}
}
