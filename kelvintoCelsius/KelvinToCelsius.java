package com.converter.kelvintoCelsius;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//A Console based Java Program to convert Kelvin to Degree Celsius
public class KelvinToCelsius {

	public KelvinToCelsius() {

	}

	
	// An Algorithm which convert Kelvin to Celsius 
	public static void converter(BufferedReader br) throws NumberFormatException, IOException {
		// A print out statement prompting a user to enter Temperature in Kelvin
		System.out.println("Temperature in Kelvin:");
		 
		//Assign to Float variable the temperature in Kelvin
		Float kelvin = Float.parseFloat(br.readLine());
		Float celsius = kelvin - 273.15F;
		//Print out statement of the current value in celsius
		System.out.println("Celsius:" + celsius);

	}

	public static void main(String[] args) throws Exception {
		// Collect the console input for the temperature in Kelvin
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//converter service is invoke into the main method 
		converter(br);
	}

}
