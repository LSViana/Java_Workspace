package chapter6;
import java.util.Scanner;
public class Ex6_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tCalculating Multiples\n");
		double number1 = 1, number2;
		while(number1 != 0) {
			System.out.print("Enter a value to number 1: "); number1 = input.nextDouble();
			if(number1 == 0) {
				System.out.println("The application is exiting."); number1 = 0;
			} else {
				number2 = 1;
				while(number2 != 0) {
					System.out.print("Enter a value to number 2: "); number2 = input.nextDouble();
					if(number2 == 0) {
						System.out.println("The application is exiting."); number1 = 0; number2 = 0;
					} else {
						if(multiple(number1, number2)) {
							System.out.printf("The numbers are multiples.\n"); 
						} else {
							System.out.printf("The numbers are not multiples.\n");
						} number2 = 0;
					}
				}
			}
		}
		input.close();
	}
	public static boolean multiple(double number1, double number2) {
		if(number2 > number1) {
			if(number2 % number1 == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
