package com.java8.features.revision.staticmethod;

public class TestingStaticMethod implements I1,I2 {
	public static void main(String[] args) {
		float amount = findSimpleInterest(1500000f, 8.2f, 3f);
		System.out.println(amount+"\n");
		float interest = I1.findSimpleInterest(1500000f, 8.2f, 3f);
		float interest1 = I2.findSimpleInterest(1500000f, 8.2f, 3f);
		System.out.println(interest);
		System.out.println(interest1);
	}

	@Override
	public String getDetails(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findSum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char getGender(char gender) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// It a different method and not the overridden one
	//	static methods can't not be overridden in the implementing class	
	//	@Override
	public static float findSimpleInterest(float principal, float rate, float time) {
		float interest, amount = 0.0f;
		interest = (principal*rate*time)/100;
		amount = principal+interest;
		return amount;
	}

}
