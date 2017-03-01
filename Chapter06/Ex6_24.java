package chapter6;
import java.util.Scanner;
public class Ex6_24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tFinding perfect numbers (Input 0 [zero] to exit)\n");
		System.out.println("1 - Input manual values\n2 - Input automatic values\n");
		int choose = input.nextInt();
		if(choose == 1) {
			System.out.println("Input a value to test: ");
			int value = input.nextInt();
			while(value != 0) {
				isPerfectManual(value);
				System.out.println("Input a value to test: ");
				value = input.nextInt();
			}
		} else if(choose == 2) {
			for(int i = 1; i <= 100000; i++) {
				isPerfectAutomatic(i);
			}
		}
		input.close();
	}
	public static void isPerfectManual(int number) {
		int factorSum = 0;
		for(int controller = 1; controller <= number / 2; controller++) {
			if(number % controller == 0) {
				factorSum += controller;
				System.out.print(controller + " ");
			}
		} if(factorSum == number)
			System.out.println("\tThe number " + number + " is perfect.");
		else
			System.out.println("The number " + number + " isn't perfect.");
	} public static void isPerfectAutomatic(int number) {
		int factorSum = 0;
		for(int controller = 1; controller <= number / 2; controller++) {
			if(number % controller == 0) {
				factorSum += controller;
				//System.out.print(controller + " ");
			}
		} if(factorSum == number)
			//System.out.println("\tThe number " + number + " is perfect.");
			System.out.println(number);
		//else
			//System.out.println("The number " + number + " isn't perfect.");
	}
}
