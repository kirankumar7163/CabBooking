package com.muthukumarip;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class DateTime {
	public static void dateCalculation(float totalAmount, float kiloMeter) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Journey Date [YYYY-MM-DD]");
		String date = scanner.next(); //Get the journey date from the user 
		LocalDate dateConversion = LocalDate.parse(date); //convert the String into integer
		LocalDate currentDate = LocalDate.now(); //Get the current date from the system

		if (dateConversion.isBefore(currentDate)) { //if the journey date is before the current date print the error message to the user

			System.out.println("Please Enter the Valid Date");
		}
		if (dateConversion.isAfter(currentDate)) { //if the journey date is after the current date call the timeCalculation method
			timeCalculation(dateConversion, currentDate, totalAmount, kiloMeter);

		} else {
			timeCalculation(dateConversion, currentDate, totalAmount, kiloMeter); //otherwise simply call the timeCalculation method

		}
		scanner.close(); //close the Scanner class
	}

	public static void timeCalculation(LocalDate date, LocalDate currentDate, float totalAmount, float kiloMeter) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter cab pickup time(HH:MM:SS)"); //Time format= Hour:Minute:Seconds[HH:
		String time = scanner.next(); //Get the pickup time from the user
		LocalTime timeConversion = LocalTime.parse(time); //parse the String to the integer
		
		if (date.equals(currentDate)) { //check if the current date is equal t the journey date
			LocalTime cabPickupTime = LocalTime.now(); //get the current time from the user
			
			if (timeConversion.isBefore(cabPickupTime))//if the pick up time is before the current time print the error message to the user

			{
				System.out.println("Please Enter the Valid Time");
			}
			if (timeConversion.isAfter(cabPickupTime)) { //if the pick up time is after the current time call the PeakHours class
				PeakHours.priceByPeakHours(timeConversion, totalAmount, kiloMeter);
			}
			if (timeConversion.equals(cabPickupTime)) { //if the pick up time is equals the current time call the PeakHours class
				System.out.println("Please wait some more minitues");
				PeakHours.priceByPeakHours(timeConversion, totalAmount, kiloMeter);
			}
			
		}
		PeakHours.priceByPeakHours(timeConversion, totalAmount, kiloMeter);// otherwise simply call the PeakHours class
		scanner.close(); //close the Scanner class
	}
}
