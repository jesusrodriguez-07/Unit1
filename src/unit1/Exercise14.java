package unit1;

import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		// Create the scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables to save the grades of the three quarters
		int firstQuarter;
		int secondQuarter;
		int thirdQuarter;
		// Declare variable to save the year average
		int avg;
		// Declare variable to save the year average with decimals
		double avgDec;
		// Ask the user for the grades of first quarter
		System.out.println("Introduce tu nota del primer trimestre: ");
		// Scan the input
		firstQuarter = sc.nextInt();
		// Ask the user for the grades of second quarter
		System.out.println("Introduce tu nota del segundo trimestre: ");
		// Scan the input
		secondQuarter = sc.nextInt();
		// Ask the user for the grades of third quarter
		System.out.println("Introduce tu nota del tercer trimestre: ");
		// Scan the input
		thirdQuarter = sc.nextInt();
		// Close the scanner
		sc.close();
		// Calculate the average grade of the year
		avgDec = (double) (firstQuarter + secondQuarter + thirdQuarter) / 3;
		// Calculate the average with decimals
		avg = (int) avgDec;
		// Show the results
		System.out.println("Nota media del curso: " + avg);
		System.out.println("Nota del expediente académico: " + avgDec);
	}
}