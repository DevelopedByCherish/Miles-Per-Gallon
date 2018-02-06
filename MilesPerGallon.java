/*
 * Cherish Shanks 
 * Miles Per Gallon
 * 4/26/2016
  */

import java.util.*;
public class MilesPerGallon {
	 public static void main(String[] args)
	   
	   {
	      double miles;    // Miles driven
	      double gallons;  //gallons of fuel
	      double mpg;      //miles per gallon
	      
	      // Create a Scanner object for keyboard input.
	      @SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
	      
	      //Get the miles driven.
	      System.out.println("Enter the number of miles driven: ");
	      miles = keyboard.nextDouble();
	      
	      //Get the number of gallons of fuel
	      System.out.println("Enter the the number gallons of fuel used: ");
	      gallons = keyboard.nextDouble();
	      
	      //Calculate Miles per Gallon
	      mpg = miles / gallons;
	      
	      // Display the mpg
	      System.out.printf("The number of miles per gallon is %10.2f", mpg); 
	    
	    
	    
	    }
	}
