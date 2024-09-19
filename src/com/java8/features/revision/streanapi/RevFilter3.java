package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;
class Worker{
	int rollNo;
	String name;
	double salary;
	public Worker(int rollNo, String name, double salary) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
	}
	
}

public class RevFilter3 {
	public static void main(String[] args) {
		Worker w1 = new Worker(1, "Sudeep", 89000.0);
		Worker w2 = new Worker(1, "Kapil", 75000.0);
		Worker w3 = new Worker(1, "Deepak", 66000.0);
		Worker w4 = new Worker(1, "Shreya", 89000.0);
		Worker w5 = new Worker(1, "Kumari", 52000.0);
		Worker w6 = new Worker(1, "Hitesh", 45400.0);
		Worker w7 = new Worker(1, "Tushar", 100000.0);
		List<Worker> workerList = Arrays.asList(w1,w2,w3,w4,w5,w6,w7);
		workerList.stream().filter(wor -> wor.salary > 80000.0).forEach(w -> System.out.println(w.name));
	}
}
