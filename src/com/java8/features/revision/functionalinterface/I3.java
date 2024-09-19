package com.java8.features.revision.functionalinterface;

public interface I3 {
//	public String getName(String name);
//	public int findSum(int a, int b);
	public default String getAddress(String address) {
		return "Shimla, H.P."; 
	}
	public static void getDetails() {
		
	}
}
