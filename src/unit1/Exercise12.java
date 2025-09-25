package unit1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		double apple;
		double pears;
		final double APPLE_PRICE = 2.35;
		final double PEARS_PRICE = 1.95;
		double total;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce the kilograms of apple you bought");
		apple = scanner.nextDouble();
		System.out.println("Introduce the kilograms of pears you bought");
		pears = scanner.nextDouble();
		apple *= APPLE_PRICE;
		pears *= PEARS_PRICE;
		total= apple += pears;
		System.out.println("This is the total price of the apples and pears: " + total + "€"); 
		
		scanner.close();

	}

}
