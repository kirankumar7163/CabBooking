package com.muthukumarip;

public class GST {
	public static void gstCalculation(float amount, float kiloMeter) {
		float gstValue = 7 * (amount / 100); //Calculate the GST value
		float totalAmount = gstValue + amount; //Calculate the total amount with GST
		System.out.println("*******TOTAL BILL AMOUNT********"); // Display all the Bill amount details to the user
		System.out.println("Bill Amount=Rs." + amount + "/-");
		System.out.println("GST Amount=Rs." + gstValue + "/-");
		System.out.println("Total Amount=Rs." + totalAmount + "/-");
		DateTime.dateCalculation(totalAmount, kiloMeter); // call the DateTime class
	}

}
