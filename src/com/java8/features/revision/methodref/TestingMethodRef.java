package com.java8.features.revision.methodref;

import java.util.ArrayList;
import java.util.List;

public class TestingMethodRef {
	static List<String> list = new ArrayList<>();
	public static void print(String s) {
		System.out.print(s+" ");
	}
	public static void main(String[] args) {
		list.add("Sudeep");
		list.add("Pooja");
		list.add("Aarti");
		list.forEach(TestingMethodRef::print);
	}

}
