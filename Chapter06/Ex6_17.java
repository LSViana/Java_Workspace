package chapter6;
import java.util.Scanner;
public class Ex6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tChoosing if a number is even or not [Input 0 (zero) to exit]\n");
		System.out.print("Enter a value: ");
		int value = input.nextInt();
		while(value != 0) {
			if(value < 0)
				System.out.print("[NEG]");
			else
				System.out.print("[POS]");
			if(isEven(value))
				System.out.println("\tThe value is even.");
			else
				System.out.println("\tThe value is odd (not even).");
			System.out.print("Enter a value: ");
			value = input.nextInt();	
		} System.out.println("The application is exiting.");
		input.close();
	}
	public static boolean isEven(int number) {
		if(number % 2 == 0)
			return true;
		else
			return false;
	}
}
