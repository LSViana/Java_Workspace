package chapter6;
import java.util.Scanner;
public class Ex6_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tReversing numbers' order [Input 0 (zero) to exit]\n");
		System.out.print("Type a number to reverse: "); int value = input.nextInt();
		while(value != 0) {
			reverseNumbers(value);
			System.out.print("Type a number to reverse: "); value = input.nextInt();
		} System.out.println("The application is exiting.");
		input.close();
	}
	public static void reverseNumbers(int number) {
		String strNumber = String.valueOf(number); int[] digits = new int[strNumber.length()];
		for(int i = 0; i < strNumber.length(); i++)
			digits[i] = Integer.parseInt(strNumber.substring(i, i + 1));
 		int result = 0; int mult = (int) Math.pow(10, strNumber.length() - 1);
		for(int i = strNumber.length() - 1; i >= 0; i--) {
			result += digits[i] * mult;
			mult /= 10;
			// System.out.printf("result: %d - i: %d - mult: %d - digits[i]: %d\n", result, i, mult, digits[i]);
		} System.out.println(result);
	}
}
