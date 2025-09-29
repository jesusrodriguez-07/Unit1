package part2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// We create the scanner
		Scanner scanner = new Scanner(System.in);

		// We declarate the variables for numbers, decimals and rounded number
		double num;
		double decimals;
		int roundNum;

		// We ask the user for his decimal number
		System.out.print("Introduce your decimal number: ");
		num = scanner.nextDouble();

		// We get the decimal part from the decimal number
		decimals = num - (int) num;

		/* Now we make that if the decimal part is equal or bigger than 0.5 
		we add 1 to the integer number */
		roundNum = (int) num + ((decimals >= 0.5) ? 1 : 0);
		System.out.printf("This is your round number: %d", roundNum);

		scanner.close();

	}

}
