package com.java8.features.revision.lambdaexp;

import java.util.function.BiPredicate;

public class TestingBiPredicate {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Waiting...");
		Thread.sleep(1500);
		BiPredicate<Integer, Float> bipre = (Integer age, Float marks) ->{
			boolean flag = false;
			if(age>12 && marks > 75.0f) {
				System.out.println("You are eligible for the headboy");
				flag = true;
			}else {
				System.out.println("Sorry try again next time");
				flag = false;
			}
			return flag;
		};
		bipre.test(15, 76.0f);
	}
}
