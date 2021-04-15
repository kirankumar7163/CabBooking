package com.muthukumarip;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Scanner class to get input Dynamically
		System.out.println("Enter your Mobile Number\n");
		Long mobileNumber = scanner.nextLong(); //Long DataType used for get the Mobile Number
		String mobileNumberString = String.valueOf(mobileNumber); // Parse the Long value into String
		if (mobileNumberString.length() != 10) //if the Mobile Number is not equal to 10 display the error message
		{
			System.out.println("Please enter valid Mobile Number(The mobile number should be in 10 digits)");
		} else {
			System.out.println("Enter Password\n");
			String password = scanner.next(); //After verification of the mobile number get the password from the user

			if (password.length() == 8) //Verify if the password is only in 8 characters
			{
				System.out.println("Login Successfully!!!");
				CabTypes.cab(); //call the CabTypes class

			} else {
				System.out.println("Invalid Password (Password should be in 8 charaters)"); // if the password is not
																							// equal to 8 characters
																							// display the error message
																							// to the user
			}
		}
		scanner.close(); //close the Scanner class

	}

}
