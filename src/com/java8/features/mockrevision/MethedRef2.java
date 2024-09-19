package com.java8.features.mockrevision;

import java.util.function.Consumer;

@FunctionalInterface
interface J{
	String m1(String msg);
}
public class MethedRef2 {
//	Way -1
	public MethedRef2(String msg) {
		System.out.println("Welcome Deepak "+msg);
	}
	
//	Way -2 
	public static void m1(String msg) {
		System.out.println("Hello Pooja "+msg);
	}
	public static void main(String[] args) {
		Consumer<String> con = MethedRef2::new;
		con.accept("How are you?");
		System.out.println("----Static Method----");
		Consumer<String> con2 = MethedRef2::m1;
		con2.accept("Kya chal raha hai?");
		
	}
}
