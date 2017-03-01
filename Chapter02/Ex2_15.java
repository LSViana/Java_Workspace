package chapter2;
import java.util.Scanner;
public class Ex2_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = input.nextInt();
		System.out.println();
		System.out.print("Enter an integer: ");
		int b = input.nextInt();
		System.out.println();
		System.out.printf("The sum: %d\nThe product: %d\nThe subtraction: %d\nThe division: %d\n", a + b, a * b, a - b, a / b);
		input.close();
	}
}
