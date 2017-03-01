package chapter2;
import java.util.Scanner;
public class Ex2_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert the first integer:");	int a = input.nextInt();
		System.out.println("Insert the first integer:");	a *= input.nextInt();
		System.out.println("Insert the first integer:");	a*= input.nextInt();
		System.out.printf("The product is %d", a);
		input.close();
	}
}
