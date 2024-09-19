package com.java8.features.revision.staticmethod;

public interface I2 extends I1 {
	public static float findSimpleInterest(float principal, float rate, float time) {
		float interest, amount = 0.0f;
		interest = (principal*rate*time)/100;
		amount = principal+interest;
		return amount;
	}
}
