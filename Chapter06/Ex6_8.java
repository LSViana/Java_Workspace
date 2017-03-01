package chapter6;
import java.util.Scanner;
public class Ex6_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tCalculating Charges – Parking Area\n");
		System.out.print("Enter the number of hours: ");
		double hours = input.nextDouble();
		double total = 0.0;
		while(hours != 0) {
			total += calculateCharges(hours);
			System.out.print("Enter the number of hours: ");
			hours = input.nextDouble();
		} System.out.printf("Total charged: US$%.2f\nThe application is exiting.", total);
		input.close();
	}
	public static double calculateCharges(double time) {
		time = Math.ceil(time);
		double charges = 3;
		if(time > 0.0 && time <= 24.00) {
			if(time > 3.0) {
				charges += (time - 3) * 0.5;
				if(charges > 10)
					charges = 10;
			} if(time <= 1)
				System.out.printf("The total charged for %.0f hour is US$%.2f\n", Math.ceil(time), charges);
			else
				System.out.printf("The total charged for %.0f hours is US$%.2f\n", Math.ceil(time), charges);
			return charges;
		} else {
			System.out.println("\tThe time is invalid, try again!");
			return 0;
		}
		// Solution 1
		/*double charges = 3;
		if(time > 0.0 && time <= 24.00) {
			if(time > 3.0) {
				charges += (Math.ceil(time) - 3.0) * 0.5;
				if(charges > 10)
					charges = 10;
			} if(time <= 1)
				System.out.printf("The total charged for %.0f hour is US$%.2f\n", Math.ceil(time), charges);
			else
				System.out.printf("The total charged for %.0f hours is US$%.2f\n", Math.ceil(time), charges);
			return charges;
		} else {
			System.out.println("\tThe time is invalid, try again!");
			return 0;
		}*/
	}
}
