package com.muthukumarip;

import java.time.LocalTime;

public class PeakHours {
	public static void priceByPeakHours(LocalTime pickUpTime, float totalAmount, float kiloMeter)
	{
		int hour=pickUpTime.getHour(); //Extract hour from the user specified time
		System.out.println("Hour:"+hour);
		if(hour>=17&&hour<=19) { //check the hour is between 5PM to 7PM
			System.out.println("This is Peak Hours so you have to pay extra Amount");
			float extraAmount=(float) (1.25*(kiloMeter/100)); //calculate the extra amount
			float totalBillAmount=extraAmount+totalAmount; //calculate the total bill amount with extra charges
			System.out.println("Therefore, your total Bill Amount is(with extra charges)="+totalBillAmount); //display the total bill amount to the user
			SeniorCitizen.senior(totalBillAmount); //call SeniorCitizen class with the total bill amount with extra charges argument
			
	}
		else
		{
			SeniorCitizen.senior(totalAmount); //Otherwise call the SeniorCitizen class without extra charges
		}
	}

}
