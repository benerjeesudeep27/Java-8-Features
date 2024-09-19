package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.List;

public class RevFilter2 {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Parminder","Roop","Dev","Kapil","Deep","Hitesh","Sunaina");
		nameList.stream().filter(name -> name.length()>4 && name.length()<=7).forEach(System.out::println);
	}
}
