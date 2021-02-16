package com.converter.poundsTokilograms;
import java.io.*;

//A Console based Java Program to convert Pounds To Kilograms
//1 Pounds = 0.45 Kg;

public class PoundsToKilograms {
	
public static void main (String[] args)throws Exception{
	  // Collect the console input for a Pound
	  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	  // A print out statement prompting a user to enter the Amount of Pound
	  System.out.println("Enter the Pounds Amount:");
	  int pound = Integer.parseInt(bf.readLine());
	  double kilo = pound * 0.45;
	  System.out.println("Kilograms: " + kilo);
	  }
	}

