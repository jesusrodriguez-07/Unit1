package unit1;

import java.util.Scanner;

public class Exercise15 {
	public static void main(String[] args) {
		// Create the scanner
		Scanner sc = new Scanner(System.in);
		// Declare variable to save the price
		double price;
		// Declare a variable to calculate the price with IVA
		double priceIVA;
		// Declare a constant with the IVA
		final double IVA_TAX = 0.21;
		// Ask the user for the price
		System.out.println("Introduce el precio de tu producto: ");
		// Scan the input
		price = sc.nextDouble();
		// Close the scanner
		sc.close();
		// Calculate the price with IVA
		priceIVA = price + (price * IVA_TAX);
		// Show the results to the user
		System.out.println("El precio final con IVA del producto es: " + priceIVA + " €");
	}
}