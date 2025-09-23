package unit1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		double radio;
		double longitud;
		double area;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce el radio de la circunferencia");
		radio = reader.nextDouble();
		 //length 
		longitud = 2*Math.PI*radio;
		System.out.println("La longitud de la circunferencia es " + longitud);
		
		area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("El área de la circunferencia es " + area);
	}

}
