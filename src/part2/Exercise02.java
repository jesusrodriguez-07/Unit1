package part2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// We create the scanner
		Scanner scanner = new Scanner(System.in);

		// We declare the variables
		int num;
		int toSeven;

		// We ask the user for a number
		System.out.println("Introduce a number: ");
		num = scanner.nextInt();

		/*
		 * Now we make that if the remainder of the division isn't equal to 0 we
		 * subtract the number we need to be multiple of 7 for that we subtract to 7 the
		 * remainder of the division
		 */
		toSeven = (num % 7 == 0) ? 0 : 7 - num % 7;

		// We show the message with the number to add
		System.out.printf("You have to add %d to be multiple of 7", toSeven);
		// We close the scanner
		scanner.close();
	}

}
