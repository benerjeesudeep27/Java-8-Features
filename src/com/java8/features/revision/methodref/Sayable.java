package com.java8.features.revision.methodref;

public class Sayable {
	public static void findSum(int a, int b) {
		int sum = 0;
		sum = a + b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		I1 i = Sayable::findSum;
		i.printSum(23, 37);
	}
}
