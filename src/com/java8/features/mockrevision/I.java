package com.java8.features.mockrevision;

public interface I {
	default int m1(int a, int b) {
		int c = a+b;
		System.out.println("Addition :-"+c);
		return c;
	}
}
interface II {
	default int m1(int a, int b) {
		int c = a/b;
		System.out.println("Addition :-"+c);
		return c;
	}
}
class A implements I, II{
	public int m1(int a, int b) {
		int c = a*b;
		System.out.println("Multiplication :-"+c);
		return c;
	}
}
class Main{
	public static void main(String[] args) {
	}
}