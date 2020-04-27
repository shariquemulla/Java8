package com.java8.lamda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTIme {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int dd = dateTime.getDayOfMonth();
		int mm = dateTime.getMonthValue();
		int yyyy = dateTime.getYear();
		System.out.printf("%d-%d-%d", dd, mm, yyyy);
		
		int hh = dateTime.getHour();
		int MM = dateTime.getMinute();
		int ss = dateTime.getSecond();
		int nn = dateTime.getNano();
		System.out.printf("\n%d:%d:%d:%d\n", hh, MM, ss, nn);
		
		LocalDateTime dateTime2 = LocalDateTime.of(1995, Month.FEBRUARY, 14, 5, 45);
		System.out.println(dateTime2);
		
		System.out.println("After 11 months : "+dateTime2.plusMonths(11));
		System.out.println("Before 5 months : "+dateTime2.minusMonths(5));
		
		LocalDate birthDate = LocalDate.of(1995, 3, 4);
		Period p = Period.between(birthDate, date);
		System.out.printf("\nDifference is : %d years, %d months, %d days\n", p.getYears(), p.getMonths(), p.getDays());
		
		Year yr = Year.of(2020);
		System.out.println("Is Leap year : "+yr.getValue()+" : "+ yr.isLeap());
		System.out.println("Is Leap year : "+Year.of(1996)+" : "+ Year.isLeap(1996));
		
		ZoneId local = ZoneId.systemDefault();
		System.out.println(local);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime laTime = ZonedDateTime.now(la);
		System.out.println(laTime);
	}

}
