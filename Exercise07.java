package part2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// We declare the variable for the number of YOUNG tickets the user want
		int numYoung;
		// variable for the number of ADULT tickets
		int numAdult;
		// final price of young tickets
		double youngPrice;
		// final price of adult tickets
		double adultPrice;
		// constant for the price of the adult tickets
		final double ADULT = 20;
		// constant for the price of the young tickets
		final double YOUNG = 15.50;
		// total without discount
		double totalNoDiscount;
		// total price
		double total;

		System.out.print("Introduce the number of child tickets you have bought: ");
		numYoung = sc.nextInt();

		System.out.print("Introduce the number of adult tickets you have bought: ");
		numAdult = sc.nextInt();

		youngPrice = numYoung * YOUNG;
		adultPrice = numAdult * ADULT;

		totalNoDiscount = (youngPrice + adultPrice);
		
		total = totalNoDiscount >= 100 ? totalNoDiscount * 0.95 : totalNoDiscount;

		System.out.println("This is the total price you have to pay: " + total);

		sc.close();

	}

}
