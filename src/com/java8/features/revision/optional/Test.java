package com.java8.features.revision.optional;

import java.util.Date;
import java.util.Optional;

public class Test {
	public static void main(String[] args) {
		String s  = null;
		Date d = null;
		Person p = null;
		System.out.println(s);
		System.out.println(d);
		System.out.println(p);
		Integer str[] = new Integer[10];
		str[2] = 25;
//		if(str[3].equals(s)) {
//			System.out.println("Done");
//		}
		Optional<Integer> op = Optional.ofNullable(str[9]);
		System.out.println(op);
//		System.out.println(op.get()); //NoSuchElementException
	}
}
