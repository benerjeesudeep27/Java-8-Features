package com.java8.features.mockrevision;

import java.util.function.Supplier;

public class SupplierDemo {
	public static int m1() {
		Supplier<Integer> sup = () -> {
			return 1000 * 1000;
		};
		return sup.get();
	}

	public static void main(String[] args) {
		int res = SupplierDemo.m1();
		System.out.println(res);
	}
}


