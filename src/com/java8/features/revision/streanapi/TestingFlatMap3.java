package com.java8.features.revision.streanapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employees{
	int id;
	String name;
	double salary;
	public Employees(int id, String name, double salary) {
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

public class TestingFlatMap3 {
	public static void main(String[] args) {
		List<Employees> emp1 = new ArrayList<>();
		emp1.add(new Employees(1, "Arun", 25000.0));
		emp1.add(new Employees(2, "Amit", 27000.0));
		emp1.add(new Employees(3, "Tina", 29000.0));
		List<Employees> emp2 = new ArrayList<>();
		emp2.add(new Employees(4, "Kamal", 22000.0));
		emp2.add(new Employees(5, "Komal", 26000.0));
		emp2.add(new Employees(6, "Vikas", 28000.0));
		List<Employees> emp3 = new ArrayList<>();
		emp3.add(new Employees(7, "Sudeep", 29000.0));
		emp3.add(new Employees(8, "Hitesh", 24000.0));
		emp3.add(new Employees(9, "Deepak", 40000.0));
		
		List<List<Employees>> mainList = Arrays.asList(emp1, emp2, emp3);
		//Before java - 8
		for(List<Employees> ep: mainList) {
			for(Employees emp : ep) {
				System.out.println(emp.name);
			}
		}
		System.out.println("=====================================");
		//Using stream API 
		List <String> name = mainList.stream().flatMap(ml -> ml.stream()).map(x -> x.name).collect(Collectors.toList());
		System.out.println(name);
	}
}
