package part2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int seconds;
		 int minutes;
		 int hours;
		 int finalSeconds;
		 int finalMinutes;
		 
		 System.out.print("Introduce the number of seconds you want: ");
		 
		 seconds = sc.nextInt();
		 
		 minutes = seconds/60;
		 hours = seconds/3600;
		 
		 finalSeconds = seconds - (minutes*60);
		 finalMinutes = minutes - (hours*60);		 
		 System.out.printf("In %d seconds are there %d hours %d minutes and %d seconds.", seconds, hours, finalMinutes, finalSeconds);
		 sc.close();

	}

}
