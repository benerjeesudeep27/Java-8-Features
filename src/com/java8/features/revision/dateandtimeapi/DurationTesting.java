package com.java8.features.revision.dateandtimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class DurationTesting {
	public static void main(String[] args) throws InterruptedException {
		Instant start = Instant.now();
//		Thread.sleep(5000l);
		Instant end = Instant.now();
		Duration diff =  Duration.between(start, end);
		System.out.println(diff.getSeconds());
		LocalDateTime time1 = LocalDateTime.now();
		Thread.sleep(5000);
		LocalDateTime time2 = LocalDateTime.now();
		Duration diff2 =  Duration.between(time1, time2);
		System.out.println(diff2.getSeconds());
	}
}
