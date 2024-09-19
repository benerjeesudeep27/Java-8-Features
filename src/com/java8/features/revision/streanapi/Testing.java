package com.java8.features.revision.streanapi;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test {
	int id;
	String name;

	public Test(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + "]";
	}
}

public class Testing {

	public static void main(String[] args) {
		/*
		 * List<Integer> intlist= new ArrayList<>(); intlist.add(1); intlist.add(2);
		 * 
		 * 
		 * List list=intlist;
		 * 
		 * list.add("Visghal");
		 * 
		 * List<String> slist=list;
		 * 
		 * slist.add("jtc");
		 * 
		 * System.out.println(slist);
		 * 
		 * slist.add(0," kumar"); System.out.println(slist);
		 */

		List<String> list = Arrays.asList("Su4deep", "7845120369", "Vishal", "7@@8", "Ravi", "98562301477", "Randeep");

		list.stream().filter(x -> x.matches("[A-Za-z]+")).sorted().forEach(System.out::println);
		System.out.println("---------------------");
		// list.stream().filter(x->x.matches("\\")).sorted().forEach(System.out::println);

		List<Test> l = new ArrayList<>();
		for (int i = 1; i < 1000; i++) {
			Test t = new Test(i, "Sudeep");
			l.add(t);
		}

		System.out.println("------------------------------Opppppp--------------------------------------");

		System.out.println(LocalDateTime.now());
		int init = LocalTime.now().getNano();
		l.stream().map(x -> x.name.toUpperCase()).forEach(System.out::println);
		int init2 = LocalTime.now().getNano();
		System.out.println("Difference" + (init2 - init) / 3600);
		int initn = LocalTime.now().getNano();
		l.stream().parallel().map(x -> x.name.toUpperCase()).forEach(System.out::println);
		int initn2 = LocalTime.now().getNano();
		System.out.println("Difference" + (init2 - init) / 3600);
		System.out.println("Difference" + (initn2 - initn) / 3600);
	}
}
