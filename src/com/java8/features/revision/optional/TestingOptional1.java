package com.java8.features.revision.optional;

import java.util.Optional;

class TestingOptional1 {

	// Driver code
	public static void main(String[] args)
	{

		// creating a string array
		String[] str = new String[5];

		// Setting value for 2nd index
		str[2] = "Geeks Classes are coming soon";

		// It returns a non-empty Optional
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		Optional<String> value = Optional.of(str[2]);

		// It returns value of an Optional.
		// If value is not present, it throws
		// an NoSuchElementException
		System.out.println("Value - "+value.get());

		// It returns hashCode of the value
		System.out.println(value.hashCode());

		// It returns true if value is present,
		// otherwise false
		System.out.println(value.isPresent());
		
	}
}
