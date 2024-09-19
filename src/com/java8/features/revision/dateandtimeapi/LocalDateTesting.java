package com.java8.features.revision.dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTesting {

	public static void main(String[] args) throws InterruptedException {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalDate customDate = LocalDate.of(1995, 05, 21);
		String date = "1995-01-27";
		System.out.println("chronology : "+now.getChronology());
		LocalDate parsedDate = LocalDate.parse(date);
		System.out.println("Parsed Date : "+parsedDate);
		System.out.println(customDate);
		int day = now.getDayOfMonth();
		int mon =  now.getMonthValue();
		Month month = now.getMonth();
		int year =  now.getYear();
		System.out.println(day);
		System.out.println(month);
		System.out.println(mon);
		System.out.println(year);
		
		LocalDate yesterday = now.minusDays(1);
		System.out.println(yesterday);
		
		LocalDate twoYearBack =  now.minusYears(2);
		System.out.println(twoYearBack);
		
		LocalDate fiveYearAfter = now.plusYears(5);
		System.out.println(fiveYearAfter);
		
		LocalDateTime time =  now.atTime(12, 05, 45); //is used to set the time
		System.out.println(time);
	}

}
