package com.java8.features.mockrevision;
@FunctionalInterface
public interface I3 {
	int a = 10;
	
	int multiply(int a, int b);
}

class XY{
	public static void main(String[] args) {
		I3 i3 = (int a, int b)-> a*b;
		int res = i3.multiply(50, 60);
		System.out.println(res);
	}
}
