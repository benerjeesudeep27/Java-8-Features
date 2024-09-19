package com.java8.features.revision.dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormaterTesting {
	public static void main(String[] args) {
		String time = "27/04/1995";
		DateTimeFormatter pattern =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date =  LocalDate.parse(time, pattern);
		System.out.println(date);
		
		String time1 = "07/07/2007, 14:30:45";
		DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss");
		LocalDateTime t = LocalDateTime.parse(time1, pattern1);
		System.out.println(t);
	}
}
