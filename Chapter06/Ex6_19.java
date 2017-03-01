package chapter6;
import java.util.Scanner;
public class Ex6_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tShowing squares of asterisks [Input 0 (zero) in value to exit]\n");
		System.out.print("Enter a value: ");
		int value = input.nextInt();
		System.out.print("Enter a character: ");
		char character = input.next().charAt(0);
		while(value != 0) {
			squareOfAsterisks(value, character);
			System.out.print("Enter a value: ");
			value = input.nextInt();
			System.out.print("Enter a character: ");
			character = input.next().charAt(0);
		}
		input.close();
	}
	public static void squareOfAsterisks(int side, char fillCharacter) {
		for(int row = 0; row < side; row++) {
			for(int col = 0; col < side; col++) {
				System.out.printf("%c ", fillCharacter);
			}
			System.out.println();
		}
	}
}
