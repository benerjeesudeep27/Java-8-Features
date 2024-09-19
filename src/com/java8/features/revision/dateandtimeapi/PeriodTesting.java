package com.java8.features.revision.dateandtimeapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTesting {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2029, 07, 15);
		Period period = Period.between(date1, date2);
		System.out.println(period);
		System.out.println("Days : "+period.getDays());
		System.out.println("Months : "+period.getMonths());
		System.out.println("Years : "+period.getYears());
	}
}
