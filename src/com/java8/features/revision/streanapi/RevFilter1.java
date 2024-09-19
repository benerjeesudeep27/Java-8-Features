package com.java8.features.revision.streanapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RevFilter1 {
	public static void main(String[] args) {
		List<Integer> numList =  Arrays.asList(40, 25, 84, 77, 96,51,33,29);
		/*Way - 1 - Old Way
		for(int a : numList) {
			if(a % 2 ==0) {
				System.out.println(a);
			}
		}*/
		
		//Way - 2 - Using Streams
		List<Integer> evenNumList = new ArrayList<>();
		evenNumList = numList.stream().filter(a -> a%2 == 0).collect(Collectors.toList());
		System.out.println(evenNumList);
		
		System.out.println("============================");
		numList.stream().filter(a -> a%2 == 0).forEach(System.out::println);
	}

}
