package chapter6;
import java.util.Scanner;
public class Ex6_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tMaking Powers with Integers - Input 0 (zero) to exit\n"); // It could be used to make powers with floating point numbers, it would be amazing :)
		System.out.printf("\t%s\n\t%s\n\t%s\n\t%s\n\n", "POSITIVE ^ POSITIVE (X)", "POSITIVE ^ NEGATIVE (X)", "NEGATIVE ^ POSITIVE (X)", "NEGATIVE ^ NEGATIVE (X)");
		System.out.print("Enter a value to base:		"); int base = input.nextInt();
		while(base != 0) {
		System.out.print("Enter a value to exponent:	"); int expo = input.nextInt();
			if(expo == 0)
				System.out.println("Result: 1");
			else {
				System.out.printf("\t%-32s %f or %f/%f\n", "Result:", integerPower(base, expo), 1.0f, 1 / integerPower(base, expo));
				System.out.printf("\t%-32s %f\n", "Result correction (Math class):", Math.pow(base, expo));
			} System.out.print("Enter a value to base:		"); base = input.nextInt();
		} System.out.println("The application is exiting.");
		input.close();
	}
	public static double integerPower(int b, int e) {
		double result = 1;
		if(/*b >= 0 &&*/ e >= 0) {
			for(; e > 0; e--) {
				result *= b;
			}
		} else if(/*b >= 0 &&*/ e < 0) {
			for(; e < 0; e++) {
			result *= 1.0 / b;
			}
		}
		return result;
	}
}
