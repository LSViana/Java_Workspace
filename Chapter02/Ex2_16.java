package chapter2;
import java.util.Scanner;
public class Ex2_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int v1 = input.nextInt();
		System.out.println("Enter an integer:");
		int v2 = input.nextInt();
		if (v1 > v2) System.out.printf("%d is larger", v1);
		else if (v1 == v2) System.out.println("These numbers are equal");
		else System.out.printf("%d is larger", v2);
		input.close();
	}
}
