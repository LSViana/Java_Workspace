package chapter2;
import java.util.Scanner;
public class Ex2_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int v;
		System.out.println("Enter an integer:");
		v = input.nextInt();
		if (v % 2 == 0) System.out.println("\nPair");
		else System.out.println("\nOdd");
		input.close();
	}
}
