package unit1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// we are going to ask the user for a number
		//Variable number
		int number; 
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Write the number you want");
		number = scanner.nextInt();
		System.out.println("This is the number you wrote " + number);
		
		scanner.close();
	}

}
