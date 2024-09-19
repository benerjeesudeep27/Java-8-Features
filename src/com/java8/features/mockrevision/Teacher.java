package com.java8.features.mockrevision;

public interface Teacher {
	String getQualifications(String degree);
	int getAge(int age);
	default void getCompleteDetails() {
		String name = "Deepak";
		String degree = "B.Tech";
		int age = 28;
		System.out.println(name);
		System.out.println(degree);
		System.out.println(age);
	}
}
class ScienceTeacher implements Teacher{

	@Override
	public String getQualifications(String degree) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAge(int age) {
		// TODO Auto-generated method stub
		return 0;
	}
	void m1() {
		getCompleteDetails();
	}

}

class Checking {
	public static void main(String[] args) {
		Teacher t = new ScienceTeacher();
		t.getCompleteDetails();
	}
}