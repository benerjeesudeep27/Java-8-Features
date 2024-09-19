package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
}
public class TestingParallelStream {
	public static void main(String[] args) {
		List<Student> stdList = Arrays.asList(
				new Student("Sudeep", 83),
				new Student("Pooja", 85),
				new Student("Avik", 90),
				new Student("Neha", 60),
				new Student("Ravi", 55),
				new Student("Arun", 75),
				new Student("Divya", 81),
				new Student("Soham", 78)				
				);
		//Using Normal Stream
		stdList.stream()
		.filter(x -> x.getScore() > 75)
		.limit(4)
		.forEach(n -> System.out.println(n.getName()+" - "+n.getScore()));
		System.out.println("====================================================");
		//Using Parallel Stream
		stdList.parallelStream()
		.filter(x -> x.getScore() > 75)
		.limit(4)
		.forEach(n -> System.out.println(n.getName()+" - "+n.getScore()));
		System.out.println("====================================================");
		//Using Parallel Method
		stdList.stream().parallel()
		.filter(x -> x.getScore() > 75)
		.limit(4)
		.forEach(n -> System.out.println(n.getName()+" - "+n.getScore()));
	}
}
