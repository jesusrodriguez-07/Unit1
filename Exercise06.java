package part2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int milimetres;
		int centimetres;
		int metres;
		int milicm;
		int mcm;
		int finalcm;
		
		System.out.println("Introduce the quantity of milimetres you want: ");
		milimetres = sc.nextInt();

		System.out.println("Introduce the quantity of centimetres you want: ");
		centimetres = sc.nextInt();
		
		System.out.println("Introduce the quantity of metres you want: ");
		metres = sc.nextInt();
		
		milicm = milimetres * 10;
		
		mcm = metres / 10;
		
		finalcm = (centimetres + milicm + mcm);
		
		System.out.printf("These are the stock in cm %d", finalcm);
		
		sc.close();

	}

}
