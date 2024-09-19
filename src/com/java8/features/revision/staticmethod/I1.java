package com.java8.features.revision.staticmethod;

public interface I1 {
	public String getDetails(String name);

	public int findSum(int a, int b);

	public char getGender(char gender);
	//Static Method :-
	static float findSimpleInterest(float principal, float rate, float time) {
		float interest = (principal * rate * time) / 100;
		return interest;
	}
}
