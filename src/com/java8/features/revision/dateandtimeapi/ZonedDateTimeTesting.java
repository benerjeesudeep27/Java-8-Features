package com.java8.features.revision.dateandtimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTesting {

	public static void main(String[] args) {
		ZonedDateTime zone = ZonedDateTime.now();
		System.out.println(zone);
		//Set<String> zones =  ZoneId.getAvailableZoneIds();
		//zones.forEach(System.out::println);
		ZonedDateTime moscow =  ZonedDateTime.now(ZoneId.of("Europe/Moscow"));
		System.out.println(moscow);
	}

}
