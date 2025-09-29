package part1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		//Declaramos las variables para guardar las pesetas y luego el resultado en euros
		int pesetas;
		double euros;
		//Creamos un Scanner para pedir al usuario el número de pesetas
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce las pesetas que quieres convertir a euros:" );
		//Scanner para que el usuario escriba el número que quiere
		pesetas = scanner.nextInt();
		//hacemos la multiplicación por 1.0 para que salgan más decimales y dividimos entre el valor de una peseta
		euros = pesetas * 1.0 / 166;
		//imprimimos por pantalla el mensaje con ambos valores
		System.out.println(pesetas + " pesetas = " + euros + "€");
		
		scanner.close();

	}

}