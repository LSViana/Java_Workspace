package chapter6;
import java.util.Scanner;
public class Ex6_27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tCalculating the Greatest Common Divisor Between Two Numbers [Input two 0 (zero) to exit]\n");
		System.out.print("Input 1 to common GCD or 2 to Euclidean GCD: "); int choose = input.nextInt();
		while(choose != 0) {
			if(choose == 1) {
				System.out.print("Type the first number:\t"); int value1 = input.nextInt();
				System.out.print("Type the second number:\t"); int value2 = input.nextInt();
				while(value1 != 0 || value2 != 0) {
					mcd(value1, value2);
					System.out.print("Type the first number:\t"); value1 = input.nextInt();
					System.out.print("Type the second number:\t"); value2 = input.nextInt();
				} choose = 0;
			} else if(choose == 2) {
				System.out.print("Type the first number:\t"); int value1 = input.nextInt();
				System.out.print("Type the second number:\t"); int value2 = input.nextInt();
				while(value1 != 0 || value2 != 0) {
					mcdEuclidean(value1, value2);
					System.out.print("Type the first number:\t"); value1 = input.nextInt();
					System.out.print("Type the second number:\t"); value2 = input.nextInt();
				} choose = 0;
			} else {
				System.out.println("Invalid input, try again!");
				choose = input.nextInt();
			}
		}
		input.close();
	}
	public static void mcd(int number1, int number2) { // Using common calculation for GCD
		int flag = Math.min(number1, number2), mcd = 0;
		for(int i = 1; i <= flag; i++) {
			if(number1 % i == 0 && number2 % i == 0)
				mcd = i;
		} System.out.println(mcd);
	}
	public static void mcdEuclidean(int number1, int number2) { // Using Euclidean Algorithm
		if(number2 == 0)
			System.out.println(number1);
		else
			mcdEuclidean(number2, number1 % number2);
	}
}
