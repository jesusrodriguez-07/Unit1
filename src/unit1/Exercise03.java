package unit1;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		// Creation of the Scanner
		Scanner sc = new Scanner(System.in);
		// Declaration of variable to storage year
		int year;
		// Declaration of variable to storage the birth year
		int birthYear;
		// Ask the user for the actual year
		System.out.println("Introduce el año actual: ");
		// Read the console input with the scanner
		year = sc.nextInt();
		// Ask the user for her birth date
		System.out.println("Introduce tu año de nacimiento: ");
		// Read the console input of the birth year
		birthYear = sc.nextInt();
		// Show and calculate the age
		System.out.println("Tienes " + (year - birthYear) + " años");
		// Close the scanner
		sc.close();	
	}
}