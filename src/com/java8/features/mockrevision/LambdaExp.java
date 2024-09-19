package com.java8.features.mockrevision;

import java.util.function.BiFunction;

@FunctionalInterface
interface K{
	double m1(int p, double r, double i);
}

public class LambdaExp {
	public static void main(String[] args) {
		Double t = Double.parseDouble(args[0]);
		BiFunction<Integer, Double, Double> bifunc = (Integer p, Double r)->{
			double i = p*t*r;
			return i;
		};
		System.out.println(bifunc.apply(50000, 6.9));
	}
	
}
