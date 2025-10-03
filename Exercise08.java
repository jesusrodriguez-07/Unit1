package part2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// we create the scanner
		Scanner sc = new Scanner(System.in);
		// we make possible to use . instead of , for the fractionary part
		sc.useLocale(Locale.US);
		// we declare the variable for metres
		double metres;
		// we declare the variable for the centimetres
		int centimetres;

		// we ask the user for the distance in m
		System.out.println("Introduce the distance you have throw the paper in metres: ");
		metres = sc.nextDouble();

		// we pass the metres with fractionary part to a integer part in centimetres
		centimetres = (int) metres * 10;
		// and we show the result
		System.out.printf("This is the distance you have made in cm: %d cm.", centimetres);

		sc.close();

	}

}
