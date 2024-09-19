package com.java8.features.mockrevision;

public interface I2 {
	String getName(String name);
	int getAge(int age);
	static void getDetails(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
}

class CheckStatic implements I2{

	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAge(int age) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	void m1() {
//		I2.getDetails(20, 30);
//	}
}
class MainCheck{
	public static void main(String[] args) {
		I2.getDetails(12, 20);
	}
}