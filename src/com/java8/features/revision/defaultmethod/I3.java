package com.java8.features.revision.defaultmethod;

public interface I3 extends I2{
	default String printMyName(String name) {
		String ss = name+" Loves Pooja";
		return ss;
	}
}
