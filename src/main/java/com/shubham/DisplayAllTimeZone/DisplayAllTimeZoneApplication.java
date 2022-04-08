package com.shubham.DisplayAllTimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DisplayAllTimeZoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayAllTimeZoneApplication.class, args);

		TimezoneDisplay display = new TimezoneDisplay();

		System.out.println("Time zones in UTC:");
		List<String> utc = display.getTimeZoneList(TimezoneDisplay.OffsetBase.UTC);
		utc.forEach(System.out::println);

		System.out.println("Time zones in GMT:");
		List<String> gmt = display.getTimeZoneList(TimezoneDisplay.OffsetBase.GMT);
		gmt.forEach(System.out::println);

		/*
		*
		* Display the time zone in java7
		*
		* */
		TimezoneDisplayJava7 displayJava7 = new TimezoneDisplayJava7();

		System.out.println("Time zones in UTC:");
		List<String> utc7 = displayJava7.getTimeZoneList(TimezoneDisplayJava7.OffsetBase.UTC);
		for (String timeZone : utc7) {
			System.out.println(timeZone);
		}

		System.out.println("Time zones in GMT:");
		List<String> gmt7 = displayJava7.getTimeZoneList(TimezoneDisplayJava7.OffsetBase.GMT);
		for (String timeZone : gmt7) {
			System.out.println(timeZone);
		}

	}
}
