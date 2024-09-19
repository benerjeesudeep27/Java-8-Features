package com.java8.features.revision.lambdaexp;

import java.util.function.Predicate;

public class TestingPredicate {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Waiting...");
		Thread.sleep(1500);
		Predicate<String> pre = (String email)->{
			boolean flag = false;
			if(email.equals("sudeepbanerjee1995@gmail.com")) {
				System.out.println("Welcome, You are in");
				flag = true;
			}else {
				System.out.println("Sorry, try again");
				flag = false;
			}
			return flag;
		};
		pre.test("sudeepbanerjee@gmail.com");
	}
}
