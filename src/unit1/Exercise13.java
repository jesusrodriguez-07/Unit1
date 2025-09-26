package unit1;

import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		// Create the scanner
		Scanner sc = new Scanner(System.in);
		// Declare variable to know if its raining
		boolean isRaining;
		// Declare variable if they have completed the homework
		boolean tasksFinished;
		// Declare variable to save if he needs to go to the library
		boolean goLibrary;
        // Ask the user if its raining 
        System.out.println("¿Está lloviendo?: ");
        // Scan the input
        isRaining = sc.nextBoolean();
        // Ask the user if they have completed the homework
        System.out.println("¿Has finalizado tus tareas?: ");
        // Scan the input
        tasksFinished = sc.nextBoolean();
        // Ask the user if he needs to go to the library
        System.out.println("¿Necesitas ir a la biblioteca?: ");
        // Scan the input
        goLibrary = sc.nextBoolean();
        // Close the scanner
        sc.close();
        // Check the results
        boolean canGoOutside = (!isRaining && tasksFinished) || goLibrary;
        // Show the result to the user
        System.out.println("¿Puedes salir a la calle?:  " + canGoOutside);
	}
}