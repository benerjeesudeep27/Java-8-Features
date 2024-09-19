package com.java8.features.mockrevision;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void m1(String name) {
		Consumer<String> con = (String city) ->{
			System.out.println("My name is "+name+" and i am from "+city);
		};
		con.accept("Bihar");
	}
	public static void main(String[] args) {
		ConsumerDemo.m1("Sudeep");
	}
}
