package com.java8.features.revision.streanapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Property {
	int proId;
	String ownerName;
	double cost;

	public Property(int proId, String ownerName, double cost) {
		super();
		this.proId = proId;
		this.ownerName = ownerName;
		this.cost = cost;
	}
}

public class RevFlatMap {
	public static void main(String[] args) {
		List<Property> proList1 = new ArrayList<>();
		proList1.add(new Property(101, "Sudeep", 300000.0));
		proList1.add(new Property(102, "Pooja", 400000.0));
		proList1.add(new Property(103, "Lovish", 500000.0));
		proList1.add(new Property(104, "Hitesh", 600000.0));
		List<Property> proList2 = new ArrayList<>();
		proList2.add(new Property(105, "Kartik", 800000.0));
		proList2.add(new Property(106, "Soham", 900000.0));
		proList2.add(new Property(107, "Kapil", 500000.0));
		proList2.add(new Property(108, "Roshan", 200000.0));
		List<List<Property>> proList = Arrays.asList(proList1, proList2);
		List<String> list = proList.stream().flatMap(x -> x.stream().filter(i -> i.ownerName.length()==6).map(u -> u.ownerName.toUpperCase())).collect(Collectors.toList());
		System.out.println(list);
	}
}
