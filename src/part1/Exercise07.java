package part1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		String nombre;
		String direccion;
		String telefono;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduzca su nombre");
		nombre = scanner.nextLine();
		
		System.out.println("Introduzca su dirección");
		direccion = scanner.nextLine();
		
		System.out.println("Introduzca su teléfono");
		telefono = scanner.next();
		
		System.out.println("Nombre introducido: " + nombre);
		System.out.println("Direccion: " + direccion);
		System.out.println("Número de teléfono: " + telefono);
		
		scanner.close();

	}

}
