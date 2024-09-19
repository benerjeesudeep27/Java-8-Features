package com.java8.features.revision.methodref;

import java.util.Arrays;
import java.util.List;

public class ZTestingArbitrayRef {
	public static void main(String[] args) throws InterruptedException {
		Integer arr[] = { 8, 7, 4, 9, 6, 3, 5, 1, 2 };
		Thread.sleep(2000);
		Arrays.sort(arr, Integer::compareTo);
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println("----------------------------------");
		List<String> fruits = Arrays.asList("Banana", "Grapes", "guava", "apples");
		fruits.sort(String::compareToIgnoreCase);
		fruits.forEach(System.out::print);
	}
}
