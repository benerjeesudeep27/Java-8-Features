package com.java8.features.revision.streanapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestingFilter4 {
	public static void main(String[] args) {
		List<Product> pro = new ArrayList<>();
		pro.add(new Product(1, "Spring Boot", 500.0f));
		pro.add(new Product(2, "Hibernate", 350.0f));
		pro.add(new Product(3, "Collection", 250.0f));
		pro.add(new Product(4, "Servlet", 450.0f));
		pro.add(new Product(5, "Java - 8", 500.0f));
//		System.out.println(pro);
//		If the field members of a class are private we will not be able to access it inside the 		lambda exp
		List<Product> proList =pro.stream().filter(p -> p.price >= 450.0f).collect(Collectors.toList());
		System.out.println(proList);
		System.out.println("==========================");
		pro.stream().filter(x -> x.price > 480.0f).forEach(System.out::println);
		System.out.println("==========================");
		pro.stream().filter(x -> x.price > 480.0f).forEach(x -> System.out.println(x.name+ " - "+x.price));
	}
}
