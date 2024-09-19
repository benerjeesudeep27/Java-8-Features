package com.java8.features.revision.optional;

import java.util.Optional;

public class TestingOptional {
	public static void main(String[] args) {
		Optional<Person> op1 = Optional.empty();
		System.out.println(op1);
		System.out.println("--------------------------------");
		Person p1 = new Person("Sudeep", "Shimla", 28, "Male");
		Person p2 = new Person("Kashish", "Solan", 38, "Male");
		Optional<Person> op2 = Optional.of(p1);
		System.out.println(op2);
		System.out.println("================================");
		Optional<Person> op3 = Optional.of(p2);
		System.out.println(op3);
		System.out.println("--------------------------------");
		Optional<Person> op4 = Optional.ofNullable(null);
		System.out.println(op4);
		Optional<Person> op5 = Optional.ofNullable(p2);
		System.out.println(op5);
		System.out.println("=============================================");
		System.out.println("=============================================");
		if(op4.isPresent()) {
			System.err.println("OP4 - "+op4);
		}else {
			System.out.println("There is no value");
		}
		System.out.println("------------With Values-----------");
		if(op5.isPresent()) {
			System.out.println(op5);
		}else {
			System.out.println("There is no value");
		}
		op4.ifPresent(System.out::println); //No Output
		System.out.println("-----Lambda Exp-----");
		op5.ifPresent((s) -> System.out.println(s));
	}
}
