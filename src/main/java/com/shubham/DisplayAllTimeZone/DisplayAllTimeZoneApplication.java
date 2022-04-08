package com.shubham.DisplayAllTimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.List;

@SpringBootApplication
public class DisplayAllTimeZoneApplication{

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DisplayAllTimeZoneApplication.class, args);

		TimezoneDisplay display = new TimezoneDisplay();

		System.out.println("Time zones in UTC:");
		List<String> utc = display.getTimeZoneList(TimezoneDisplay.OffsetBase.UTC);
//		utc.forEach(System.out::println);
		try{
			PrintStream file = new PrintStream(new File("utc.txt"));
			System.setOut(file);
			utc.forEach(file::print);
		} catch (Exception e) {
			e.printStackTrace();
		}


		System.out.println("Time zones in GMT:");
		List<String> gmt = display.getTimeZoneList(TimezoneDisplay.OffsetBase.GMT);
//		gmt.forEach(System.out::println);
		try {
			PrintStream file = new PrintStream(new File("gmt.txt"));
			System.setOut(file);
			gmt.forEach(file::print);
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 *
		 * Display the time zone in java7
		 *
		 */
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
