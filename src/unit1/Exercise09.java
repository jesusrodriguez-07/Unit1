package unit1;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		// Creation of the scanner
		Scanner sc = new Scanner(System.in);
		// Declare a variable to storage the age
		int age;
		// Declare a variable to 
		boolean legalAge;
		// Ask the user for the age
		System.out.println("Introduce tu edad: ");
		// Scan the input
		age = sc.nextInt();
		// Close the scanner
		sc.close();
		// Check if you are of legal age
		legalAge = age >= 18;
		// Show the results
		System.out.println("¿Eres mayor de edad? " + legalAge);
	}
}