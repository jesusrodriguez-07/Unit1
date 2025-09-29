package part1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		int age;
		boolean over18;
		
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Introduce your age: ");
		 age = scanner.nextInt();
		 
		 over18 = age >= 18; 
				
		 System.out.println(over18);
		 scanner.close();

	}

}
