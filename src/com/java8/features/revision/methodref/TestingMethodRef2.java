package com.java8.features.revision.methodref;

import java.util.function.BiFunction;

public class TestingMethodRef2 {
	public static int findSum(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}
	public static float findSum(int a, float b) {
		float sum = 0;
		sum = a + b;
		return sum;
	}
	public static float findSum(float a, float b) {
		float sum = 0;
		sum = a + b;
		return sum;
	}
	public static void main(String[] args) {
			BiFunction<Integer, Integer, Integer> add1 = TestingMethodRef2::findSum;
			BiFunction<Integer, Float, Float> add2 = TestingMethodRef2::findSum;
			BiFunction<Float, Float, Float> add3 = TestingMethodRef2::findSum;
			int sum1 =add1.apply(45, 45);
			float sum2 = add2.apply(45, 35.0f);
			float sum3 = add3.apply(35.0f, 35.0f);
			System.out.println(sum1);
			System.out.println(sum2);
			System.out.println(sum3);
	}
}
