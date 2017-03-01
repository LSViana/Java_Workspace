package chapter6;
import java.util.Scanner;
public class Ex6_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tFinding the lowest number among three numbers [Enter three 0 (zero) to exit]\n");
		System.out.print("Input the first value:\t");
		int n1 = input.nextInt();
		System.out.print("Input the second value:\t");
		int n2 = input.nextInt();
		System.out.print("Input the third value:\t");
		int n3 = input.nextInt();
		while(n1 != 0 || n2 != 0 || n3 != 0) {
			minimum3(n1, n2, n3);
			System.out.print("Input the first value:\t");
			n1 = input.nextInt();
			System.out.print("Input the second value:\t");
			n2 = input.nextInt();
			System.out.print("Input the third value:\t");
			n3 = input.nextInt();
		}
		input.close();
	}
	public static void minimum3(int number1, int number2, int number3) {
		int less = Math.min(number1, number2);
		less = Math.min(less, number3);
		System.out.println("The minimum value is " + less);
	}
}
