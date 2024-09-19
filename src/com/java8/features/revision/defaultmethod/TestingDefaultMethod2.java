package com.java8.features.revision.defaultmethod;

public class TestingDefaultMethod2 implements I2{

	public static void main(String[] args) {
		I2 ii = new TestingDefaultMethod2();
		String ss = ii.printMyName("Vikas Mahato");
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
