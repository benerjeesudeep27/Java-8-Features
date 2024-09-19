package com.java8.features.revision.defaultmethod;

public class TestingDefaultMethod3 implements I3{

	public static void main(String[] args) {
		I3 ii = new TestingDefaultMethod3();
		String ss = ii.printMyName("Arjun Sharma");
		System.out.println(ss);
	}

	@Override
	public boolean isInterface() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int findSum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char gender(char gen) {
		// TODO Auto-generated method stub
		return 0;
	}

}
