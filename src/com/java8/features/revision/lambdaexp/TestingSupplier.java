package com.java8.features.revision.lambdaexp;

import java.util.function.Supplier;
import java.util.Scanner;

public class TestingSupplier {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name : ");
		String name = sc.next();
		System.out.println("Waiting...");
		Thread.sleep(2000);
		Supplier<String> s = ()-> "Hello "+name;
		System.out.println(s.get());
		sc.close();
	}
}
