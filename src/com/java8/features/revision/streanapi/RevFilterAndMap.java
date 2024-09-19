package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;

class Teacher{
	int empId;
	String name;
	double salary;
	public Teacher(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
}

public class RevFilterAndMap {
	public static void main(String[] args) {
		List<Teacher> teacherList = Arrays.asList(
				new Teacher(101, "Sudeep", 20000.0),
				new Teacher(102, "Keshav", 22000.0),
				new Teacher(103, "Hemant", 32000.0),
				new Teacher(104, "Kartik", 40000.0),
				new Teacher(105, "Pooja", 80000.0),
				new Teacher(106, "Rishi", 75000.0));
		
		
		teacherList.stream().filter(t -> t.salary > 70000.0).map(i -> i.salary + 3200).forEach(p -> System.out.println(p));
	}

}
