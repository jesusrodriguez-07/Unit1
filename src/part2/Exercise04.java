package part2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// We create the scanner 
		Scanner scanner = new Scanner(System.in);
		
		// We declare the variables
		int valA;
		int valB;
		int valC;
		int valX;
		int valY;
		
		// We show the messages to ask the user for these values
		System.out.println("Write the value of a: ");
		valA = scanner.nextInt();
		
		System.out.println("Write the value of b: ");
		valB = scanner.nextInt();
		
		System.out.println("Write the value of c: ");
		valC = scanner.nextInt();
		
		System.out.println("Write the value of x: ");
		valX = scanner.nextInt();
		
		// We find the value of y
		valY = valA * (valX * valX) + (valB * valX) + valC;
		
		// Now we show the value of Y
		System.out.printf("This is the value of Y: %d", valY);
		
		// We close the scanner
		scanner.close();

	}

}
