package chapter2;

/*
 *  This program will calculate the product of three integers.
 */

import java.util.Scanner;
public class Ex2_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, z, result;
		System.out.println("Insert the first integer:");	x = input.nextInt();
		System.out.println("Insert the second integer:");	y = input.nextInt();
		System.out.println("Insert the third integer:");	z = input.nextInt();
		result = x * y * z;
		System.out.printf("Product is %d", result);
		input.close();
	}
}