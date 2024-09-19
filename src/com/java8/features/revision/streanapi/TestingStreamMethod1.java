package com.java8.features.revision.streanapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestingStreamMethod1 {
	public static void main(String[] args) {
//		1. Count();
		List<String> name = Arrays.asList("Pooja", "Ravi", "John", "Sudeep", "Kishore", "Keshav", "Sudeep", "John");
		long count = name.stream().filter(x -> x.length() >= 4 && x.length() <= 5).count();
		System.out.println(count);
		
//		2. Distinct();
		long count1 = name.stream().distinct().count();
		System.out.println("Distinct : "+count1);
		
//		3. Limit();
		name.stream().limit(4).forEach(System.out::println);
		
//		4.Min();
		List<Integer> num = Arrays.asList(1, 2, 3, 11, 8, 9, 10);
		Optional<Integer>  min = num.stream().min((val1, val2) -> {return val1.compareTo(val2);});
		System.out.println(min.get());
		
//		5. Max();
		Optional<Integer> max = num.stream().max((val1, val2) -> {return val1.compareTo(val2);});
		System.out.println(max.get());
		
//		6. Reduce(); Join all the string into one
		Optional<String> reduce= name.stream().reduce((value, nextValue) -> {
							return value+" "+nextValue; //SudeepRaviJohnSudeep...
					});
		System.out.println(reduce.get());
		System.out.println("===========================================");
		Optional<Integer> reduce1= num.stream().reduce((value, nextValue) -> {
			return value+nextValue; //1+2+3+4....
		});
		System.out.println(reduce1.get());
		
//		7. ToArray();
		Object arr[] = name.stream().toArray();
		for(Object obj : arr) {
			System.out.println(obj);
		}
		
//		8.Sorted();
		name.stream().sorted().forEach(x -> System.out.print(x+" "));
		System.out.println("\n------------------------");
		name.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s+" "));
		System.out.println();
		num.stream().sorted().forEach(x -> System.out.print(x+" "));
		System.out.println("\n-------------------------");
		num.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x+" "));
		
//		9. anyMatch();
		boolean b = name.stream().anyMatch(x -> x.startsWith("S"));
		System.out.println("\nb : "+b); //true
		boolean b1 = num.stream().anyMatch(x -> x == 1);
		System.out.println("b1 : "+b1); //true
		
//		10.  allMatch();
		boolean b2 = name.stream().allMatch(x -> x.startsWith("S"));
		System.out.println("b2 : "+b2); //false
		boolean b3 = num.stream().allMatch(x -> x == 1);
		System.out.println("b3 : "+b3);//false
		
//		11.noneMatch(); Opposite of allMatch();
		boolean b4 = name.stream().noneMatch(x -> x.startsWith("K"));
		System.out.println("b4 : "+b4); //false
		boolean b5 = num.stream().noneMatch(x -> x==11);
		System.out.println("b5 : "+b5); //true
		
//		12. findAny();
		Optional<String> o1 =name.stream().findAny();
		System.out.println(o1.get()); //Pooja
		Optional<Integer> o2 =num.stream().findAny();
		System.out.println(o2.get());
		
//		13.findFirst();
		Optional<String> o3 =name.stream().findFirst();
		System.out.println(o3.get());
		Optional<Integer> o4 = num.stream().findFirst();
		System.out.println(o4.get());
	}
}
