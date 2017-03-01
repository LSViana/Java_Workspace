package chapter2;
import java.util.Scanner;
public class Ex2_24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bigger = 0, smaller = 0;
		System.out.println("Enter an integer:");
		int v1 = input.nextInt();
		System.out.println("Enter an integer:");
		int v2 = input.nextInt();
		if (v1 >= v2) { bigger = v1; smaller = v2; }
		else { bigger = v2; smaller = v1; }
		System.out.println("Enter an integer:");
		int v3 = input.nextInt();
		if (v3 > bigger) bigger = v3;
		else if(v3 < smaller) smaller = v3;
		System.out.println("Enter an integer:");
		int v4 = input.nextInt();
		if (v4 > bigger) bigger = v4;
		else if(v4 < smaller) smaller = v4;
		System.out.println("Enter an integer:");
		int v5 = input.nextInt();
		if (v5 > bigger) bigger = v5;
		else if(v5 < smaller) smaller = v5;
		System.out.printf("\nThe biggest number: %d\nThe smallest number: %d\n", bigger, smaller);
		input.close();
	}
}
