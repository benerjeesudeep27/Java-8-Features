package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RevStreamMethod_4 {
	public static void main(String[] args) {
		List<String> values = Arrays.asList("A", "B","C", "1", "2","3");
		List<Integer> num = Arrays.asList(7,0,1,8,9,1,4,8,2,2); 
		Optional<String> res = values.stream().reduce((val, combinedVal) -> {return val+combinedVal;});
		System.out.println(res.get());
		
		System.out.println("=============================");
		Optional<Integer> result = num.stream().reduce((num1, num2)-> 
		{
			return num1+num2;
		});
		System.out.println(result.get());
	}
}
