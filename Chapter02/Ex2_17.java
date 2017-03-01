package chapter2;
import java.util.Scanner;
public class Ex2_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bigger, smaller;
		System.out.println("Enter an integer:");
		int v1 = input.nextInt();
		bigger = v1; smaller = v1;
		System.out.println("Enter an integer:");
		int v2 = input.nextInt();
		if (v2 > v1) bigger = v2;
		else smaller = v2;
		System.out.println("Enter an integer:");
		int v3 = input.nextInt();
		if (v3 > bigger) bigger = v3;
		else smaller = v3;
		System.out.printf("\nThe sum: %d\nThe average: %d\nThe product: %d\nThe biggest number: %d\nThe smallest number: %d\n", v1 + v2 + v3, (v1 + v2 + v3) / 3, v1 * v2 * v3, bigger, smaller);
		input.close();
	}
}
