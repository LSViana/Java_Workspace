package chapter2;
import java.util.Scanner;
public class Ex2_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int v1 = input.nextInt();
		System.out.print("\nEnter the first integer: ");
		int v2 = input.nextInt();
		if (v1 % v2 == 0) System.out.println("\nFirst is a multiple of second");
		else System.out.println("\nFirst isn't a multiple of second");
		input.close();
	}
}
