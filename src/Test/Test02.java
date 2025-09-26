package Test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		int hour;
		double salaryPerHour;
		double untaxedSalary;
		double salary;

		Scanner scanner = new Scanner(System.in);
		// We ask the user how many hours he worked
		System.out.println("How many hours did you worked?: ");
		hour = scanner.nextInt();
		// We ask the user his salary per hour
		System.out.println("What is your salary per hour?: ");
		salaryPerHour = scanner.nextDouble();
		//We multiply the hours of work and the salary per hour
		untaxedSalary = salaryPerHour * hour;
		//we compare if the salary is above 1000 and make the 90 or 85 %
		salary = (untaxedSalary>=1000) ? untaxedSalary * 0.85 : untaxedSalary * 0.90;
		System.out.println("This is your salary: " + salary);
		
		scanner.close();
	}

}
