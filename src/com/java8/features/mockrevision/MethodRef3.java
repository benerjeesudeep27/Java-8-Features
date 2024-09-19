package com.java8.features.mockrevision;
@FunctionalInterface
interface Z{
	float m1(int p, float r, float t);
}
public class MethodRef3 {
//	Way -1
//	public MethodRef3(int p, float r, float t) {
//		float i = 5;
//		i = p * r * t;
//		System.out.println("Interest :-"+i);
//		
//	}
	
//	Way -2
//	float findInterest(int p, float r, float t) {
//		float i = 5;
//		i = p * r * t;
//		return i;
//	}
	
//	Way -3
	static float findInterest(int p, float r, float t) {
		float i = 5;
		i = p * r * t;
		return i;
	}
	
	public static void main(String[] args) {
		Z z = MethodRef3 :: findInterest;
		System.out.println(z.m1(50000, 6.9f, 5));
	}
}
