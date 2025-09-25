package unit1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// ask for a number and print if the number is even or odd
		int number;
		boolean even;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write a number: ");
		number = scanner.nextInt();
		
		even = number % 2 == 0;
		
		System.out.println("Your number is even?: " + (even ? "Yes" : "No"));
		
		
		scanner.close();

	}

}
