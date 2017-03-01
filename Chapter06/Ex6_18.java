package chapter6;
import java.util.Scanner;
public class Ex6_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tShowing squares of asterisks [Input 0 (zero) to exit]\n");
		System.out.print("Enter a value: ");
		int value = input.nextInt();
		while(value != 0) {
			squareOfAsterisks(value);
			System.out.print("Enter a value: ");
			value = input.nextInt();
		}
		input.close();
	}
	public static void squareOfAsterisks(int side) {
		for(int row = 0; row < side; row++) {
			for(int col = 0; col < side; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
