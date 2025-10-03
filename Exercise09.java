package part2;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// we create the scanner
		Scanner sc = new Scanner(System.in);

		// we declare the variable for the id number
		int id;
		// and the variable for the volume
		int volume;

		// we ask the user for the number of the id he wants
		System.out.println("Introduce thu number of id: ");
		id = sc.nextInt();

		// we make the operations to know the volume
		volume = id / 100;

		// we show the result to the user
		System.out.printf("This is the volume of your id number: %d", volume);

		sc.close();

	}

}
