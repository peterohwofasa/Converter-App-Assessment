package com.converter.milesToKilometers;
import java.io.*;

//A Console based Java Program to convert Miles To Kilometers 
//1 mile = 1.609 344 kilometer;

public class MilesToKilometers {

public static void main (String[] args)throws Exception{
	// Collect the console input for a mile
	  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	// A print out statement prompting a user to enter the number of Mile
	  System.out.print("Enter Number of miles: ");
	  float miles = Float.parseFloat(bf.readLine());
	  float kilometer = miles * 1.609344f;
	  System.out.println(miles + " miles is " + kilometer + " kilometers.");
	  }
	}

