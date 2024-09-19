package com.java8.features.revision.functionalinterface;

@FunctionalInterface
public interface I1 {
	int MIN = 5000;
	public String getName(String name);
}
class XYZ implements I1{

	@Override
	public final String getName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}