package com.java8.features.revision.dateandtimeapi;

import java.time.Instant;

public class InstantTesting {
	public static void main(String[] args) {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		Instant instant = Instant.now(); //giving time in nano secs
		System.out.println(instant);
	}
}
