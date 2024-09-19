package com.java8.features.revision.defaultmethod;

public interface X2 {
	default void getName(String name) {
		String n = name.toUpperCase();
		System.out.println(n);
	}
}
