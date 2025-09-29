package part1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//We are going to ask the user for his age and add 1 to it

		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Write your age");
		age = scanner.nextInt();
		++age;
		System.out.println("This is going to be your age in the next year " + age); 
	}

}
