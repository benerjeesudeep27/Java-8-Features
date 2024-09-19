package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
public class TestingMapAndFilter {
	public static void main(String[] args) {
		/*
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Sudeep", 26000.0));
		emp.add(new Employee(2, "Pooja", 28000.0));
		emp.add(new Employee(3, "Aarti", 32000.0));
		emp.add(new Employee(4, "Vikas", 27000.0));
		emp.add(new Employee(5, "Jatin", 25000.0));
		*/
		List <Employee> emp = Arrays.asList(
				new Employee(101, "Goutam", 26000.0),
				new Employee(102, "Virat", 28000.0),
				new Employee(103, "Sachin", 32000.0),
				new Employee(104, "Suresh", 27000.0),
				new Employee(105, "Virendra", 25000.0));
		
		List<Double> empSal =emp.stream().filter(x -> x.salary >= 27000.0).map(s -> s.salary + 200).collect(Collectors.toList());
		System.out.println(empSal);
		System.out.println("==========================");
		emp.stream().filter(x -> x.salary >= 27000.0).map(x -> x.name.toUpperCase()).forEach(e -> System.out.println(e));
	}
}
