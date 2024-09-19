package com.java8.features.revision.defaultmethod;

public class TestingDefaultMethod implements I1{
	public static void main(String[] args) {
		TestingDefaultMethod t = new TestingDefaultMethod();
		System.out.println(t.isInterface());
		System.out.println(t.findSum(20, 50));
		System.out.println(t.gender('M'));
		
		//First way to call default method
		I1 ii = new TestingDefaultMethod();
		String name = ii.printMyName("Sudeep");
		System.out.println(name);
		
		//Second way to call default method
		System.out.println(t.printMyName("Pooja"));
	}

	@Override
	public boolean isInterface() {
		boolean flag = false;
		Class<I1> c = I1.class;
		if(c.isInterface()) {
			flag = true;
		}
		return flag;
	}

	@Override
	public int findSum(int a, int b) {
		int sum = a+b;
		return sum;
	}

	@Override
	public char gender(char gen) {
		return gen;
	}
	@Override
	public String printMyName(String name) {
//		I1.super.getMyName();  Stack Over flow
		System.out.println();
		String ss = name+" is going to Siuri on 9th Feb";
		return ss;
	}
}
