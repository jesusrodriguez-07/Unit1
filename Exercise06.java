package part2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		// we create the scanner
		Scanner sc = new Scanner(System.in);

		// we declare the variable for the milimetres
		int milimetres;
		// we declare the variable for the centimetres
		int centimetres;
		// we declare the variable for the metres
		int metres;
		// we declare the variable for the milimetres to centimetres
		int milicm;
		// we declare the variable for the metres to centimetres
		int mcm;
		// we declare the variable for the final result of the add of centimetres
		int finalcm;

		// we ask the user for the quantity of milimetres
		System.out.println("Introduce the quantity of milimetres you want: ");
		milimetres = sc.nextInt();

		// we ask the user for the quantity of centimetres
		System.out.println("Introduce the quantity of centimetres you want: ");
		centimetres = sc.nextInt();

		// we ask the user for the quantity of metres
		System.out.println("Introduce the quantity of metres you want: ");
		metres = sc.nextInt();

		// we pass milimetres to centimetres
		milicm = milimetres * 10;

		// and metres to centimetres
		mcm = metres / 10;

		// we make the additions for the result of centimetres
		finalcm = (centimetres + milicm + mcm);

		// we show the result to the user
		System.out.printf("These are the stock in cm %d", finalcm);

		sc.close();

	}

}