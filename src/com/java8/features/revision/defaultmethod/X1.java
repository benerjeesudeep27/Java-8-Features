package com.java8.features.revision.defaultmethod;

public interface X1 {
	default String getName(String name) {
		String n = name.toUpperCase();
		return n;
	}
}
