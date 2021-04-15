package com.muthukumarip;

import java.time.LocalDate;

import java.util.Scanner;

public class SeniorCitizen {
	public static void senior(float totalAmount) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Date Of Birth [YYYY-MM-DD]");
		String dob = scanner.next(); //Get the User DOB as a String
		
		LocalDate dobConversion = LocalDate.parse(dob); //convert the String into integer
		
		LocalDate currentDate = LocalDate.now(); //Get the current date of the system
		int dobSenior = dobConversion.getYear(); //Extract the year from the DOB
		int currDate = currentDate.getYear(); //Extract the year from the current date
		int age = currDate - dobSenior; //subtract DOB year from the current year
		if (age > 60) { //check the age is greater than 60
			float seniorBillAmount = (50 / 100) * totalAmount; //Calculate discount amount
			System.out.println(
					"You are a Senior Citizen So we are reduce 50% from your Bill Amonut\n Therefore your Bill Amount IS Rs. "
							+ seniorBillAmount + "\n*****ENJOY YOUR JOURNEY*****");
		} else {
			System.out.println("You are not a Senior Citizen\n*****ENJO YOUR JOURNEY*****");
		}
		scanner.close(); //close the Scanner class

	}

}
