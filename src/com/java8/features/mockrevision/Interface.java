package com.java8.features.mockrevision;

public interface Interface {
	default int m1(int a, int b) {
		int c = a + b;
		return c;
	}
}
interface I1 extends Interface{
	@Override
	default int m1(int a, int b) {
		int c = a *b;
		return c;
	}
}
class Check implements Interface, I1{
	public static void main(String[] args) {
		Interface ch = new Check();
		int res = ch.m1(45, 50);
		System.out.println(res); //Overridden method will run always 
	}
}