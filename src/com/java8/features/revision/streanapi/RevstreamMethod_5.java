package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;

public class RevstreamMethod_5 {

	public static void main(String[] args) {
		List<String> values = Arrays.asList("A", "B","C", "1", "2","3");
		Object arr[] = values.stream().toArray();
		for(Object a : arr) {
			System.out.println(a);
		}
	}

}
