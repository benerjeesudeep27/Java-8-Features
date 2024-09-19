package com.java8.features.mockrevision;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx3 {
	static Student getStudent(int id, String name, String city) {
		return new Student(id, name, city);
	}
	public static void main(String[] args) {
		Optional<Student> op = Optional.empty();
		System.out.println(op);
		Student std = new Student(111,"Sim","Noida");
		Student std1 = new Student(222,"Jim","Delhi");
		Student std2 = new Student(333,"Rim","Pune");
		List<Student> list = Arrays.asList(std, std1, std2, null);
		Optional<Student> op1 = Optional.ofNullable(list.get(3));
		System.out.println(op1.isPresent());
		op1.ifPresent(t -> System.out.println(t));
		op1.ifPresent(System.out::println);
		System.out.println(op1.orElseGet(()-> getStudent(444, "Jaya", "Mumbai")));
		System.out.println(op1.orElse(std2));
	}
}
