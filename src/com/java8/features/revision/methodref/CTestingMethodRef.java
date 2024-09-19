package com.java8.features.revision.methodref;

public class CTestingMethodRef {
	
	public CTestingMethodRef(int a, int b, int c) {
		int mul = a * b * c;
		System.out.println("Running Constructor");
		System.out.println(mul);
	}

	public static void main(String[] args) throws InterruptedException {
			System.out.print("Waiting");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.println(".");
			Thread.sleep(2000);
			C1 c = CTestingMethodRef::new;
			c.findMultiple(12, 12, 12);
	}
}
