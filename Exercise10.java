package part2;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// we create the scanner
		Scanner sc = new Scanner(System.in);
		// we declare the variable for the years
		int year;
		// we declare the variable fot the century
		int century;

		// we ask the user to introduce the year he wants
		System.out.println("Introduce the year you want to know what century it is: ");
		year = sc.nextInt();

		// we make the operations to make that if the year is 1400 it's century 14
		// and in the year 1401 is century 15
		century = year % 100 == 0 ? year / 100 : year / 100 + 1;
		// we show the result to the user
		System.out.printf("In the year %d you are on the century %d", year, century);

		sc.close();

	}

}
