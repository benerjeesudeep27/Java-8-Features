package com.java8.features.revision.optional;

import java.util.Optional;

public class TestingOptional2 {

	public static void main(String[] args) {
		// Creating an Integer array of size 10
		Integer[] nums = new Integer[10];
		nums[5] = 56;
		// Wrapping the element at index 4 in an Optional object
		Optional<Integer> maybeInt = Optional.ofNullable(nums[5]);

		if (maybeInt.isPresent()) {
			// Extracting the value from Optional object and converting it to int
			int num = nums[5].intValue();
			System.out.println(num);
		} else {
			// Printing message as the value is not present
			System.out.println("int value not present");
		}
	}
}
