package com.java8.features.revision.defaultmethod;

public interface I1 {
	abstract public boolean isInterface();
	abstract public int findSum(int a, int b);
	abstract public char gender(char gen);
	default String printMyName(String name) {
		String s = null;
		s = name.toUpperCase();
		return s;
	}
	default void getMyName() {
		//call above default method
		String name = printMyName("Keya Banerjee");
		System.out.println(name);
	}
}
class J implements I1{

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
	public static void main(String[] args) {
		J j = new J();
		j.getMyName();
	}
}