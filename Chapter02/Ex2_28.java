package chapter2;
import java.util.Scanner;
public class Ex2_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the circunference's radius: ");
		int r = input.nextInt();
		System.out.printf("\nThe diameter: %d u.m.\nThe circunference: %.2f u.m.\nThe area: %.2f u.m.\n", r * 2, Math.PI * 2 * r, Math.PI * r * r);
		input.close();
	}
}
