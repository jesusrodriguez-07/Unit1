package unit1;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// ask for two numbers and show the addition subtraction multiplication and division
		int num1;
		int num2;
		int add;
		int sub;
		int mult;
		double div;
		//Write the two numbers
		System.out.println("Write two numbers");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		add = (num1 + num2);
		sub = (num1 - num2);
		mult = (num1 * num2);
		div = (num1 / num2);
		
		System.out.println("Addition: " + add);
		System.out.println("Subtraction: " + sub);
		System.out.println("Multiplication: " + mult);
		System.out.println("Division: " + div);

	}

}
