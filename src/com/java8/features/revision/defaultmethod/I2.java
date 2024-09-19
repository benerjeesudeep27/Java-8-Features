package com.java8.features.revision.defaultmethod;

public interface I2 extends I1{
	default String printMyName(String name) {
		String ss = name + " Learing Java Technology";
		return ss;
	}
}
