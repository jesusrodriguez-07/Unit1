package part2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// We create the scanner
		Scanner scanner = new Scanner(System.in);
		// We declare the variables
		int num1;
		int num2;
		int toNum2;

		// We ask for the first number
		System.out.println("Introduce a number: ");
		num1 = scanner.nextInt();

		// Now we ask for the second number
		System.out.println("Introduce another number: ");
		num2 = scanner.nextInt();

		/*
		 * We make that if the reminder of the division isn't equal to 0 we have to
		 * subtract the remainder of num1 and num2 to num2 to have the number we have to
		 * add to be multiple of num2
		 */
		toNum2 = (num1 % num2 == 0) ? 0 : num2 - num1 % num2;

		// We show the message with the number we have to add to be multiple of num2
		System.out.printf("You have to add %d to be multiple of %d", toNum2, num2);

		// We close the scanner
		scanner.close();
	}

}
