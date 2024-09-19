package com.java8.features;

interface I1{
	void m1();
	int m2();
	String m3();
	default int m4() {
		int a= 10, b = 20, c = 30;
		int sum = a+b+c;
		System.out.println(sum);
		System.out.println("Tere Bin");
		return sum;
	}
	default void m5() {
		int i = m4();
		System.out.println(i);
	}
	default String m6() {
		m5();
		return "Sudeep";
	}
}

interface I2 extends I1{
	public default int m4() {
		System.out.println("Sudeep Banerjee");
		return 200;
	}

}

class Access implements I1{
	public int m4() {
		System.out.println("Har Har Mahadev");
		return 500;
	}
	@Override
	public void m1() {
	
	}

	@Override
	public int m2() {
		
		return 0;
	}

	@Override
	public String m3() {
		
		return null;
	}

	class Inner extends Access{
	
		
	}
	public static void main(String[] args) {
		I1 i = new Access();
		int ii = i.m4();
		System.out.println(ii);
	}
}

class Sudeep implements I1, I2{
	public static void main(String[] args) {
		I2 i = new Sudeep();
		int ii = i.m4();
		System.out.println(ii);
	}

	@Override
	public void m1() {
	
	}

	@Override
	public int m2() {
	
		return 0;
	}

	@Override
	public String m3() {
		
		return null;
	}
}

