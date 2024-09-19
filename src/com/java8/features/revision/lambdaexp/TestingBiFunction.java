package com.java8.features.revision.lambdaexp;

import java.util.function.BiFunction;

public class TestingBiFunction {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Waiting...");
		Thread.sleep(2000);
		BiFunction<Integer, Float, String> bifunc = (Integer i, Float f) ->{ 
			if(i > 18 && f > 75.5f) { //1st & 2nd argument
				return "You are qualified"; //3rd argument
			}else {
				return "You are not qualified"; //3rd argument
			}
		};
		System.out.println(bifunc.apply(19, 76.0f));
	}

}
