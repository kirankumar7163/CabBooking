package com.muthukumarip;

import java.util.Scanner;

public class PriceEstimator {

	public static void cabType() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter you want which type of Cab");
		String cabType = scanner.next(); // Get the car type from the user
		System.out.println("Howmany Kilo meter you want to travel in this cab");
		float kiloMeter = scanner.nextFloat(); // Get the kilometer from the user
		
		// In all if cases ignore the case sensitive and call the specified function
		if (cabType.equalsIgnoreCase("MICRO")) {
			microCab(kiloMeter);
		} else if (cabType.equalsIgnoreCase("MINI")) {
			miniCab(kiloMeter);
		} else if (cabType.equalsIgnoreCase("PRIME")) {
			primeCab(kiloMeter);
		} else {
			System.out.println("Please enter only the available cab type listed in the above");

		}
		scanner.close(); // close the Scanner class
	}

    // In each function calculate the amount by using the kilometers and call the GST class
	public static void microCab(float kiloMeter) {
		float amount = 10 * kiloMeter;
		System.out.println("Your Bill Amount=Rs. " + amount + "/-");
		GST.gstCalculation(amount, kiloMeter);
	}

	public static void miniCab(float kiloMeter) {
		float amount = 15 * kiloMeter;
		System.out.println("Your Bill Amount=Rs. " + amount + "/-");
		GST.gstCalculation(amount, kiloMeter);
	}

	public static void primeCab(float kiloMeter) {
		float amount = 20 * kiloMeter;
		System.out.println("Your Bill Amount=Rs. " + amount + "/-");
		GST.gstCalculation(amount, kiloMeter);
	}

}
