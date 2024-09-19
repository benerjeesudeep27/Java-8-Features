package com.java8.features.revision.streanapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewQuestion {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("Sudeep");
		nameList.add("Kapil");
		nameList.add("Raju");
		nameList.add("Deepak");
		nameList.add("Amit");
		nameList.add("Jeeshan");
		nameList.add("Tejas");
		nameList.add(null);
		
		List<String> sortedList = nameList.stream().
				filter(x -> x != null).
				sorted(Comparator.reverseOrder()).
				collect(Collectors.toList());
		
		System.out.println(sortedList);
	}
}
