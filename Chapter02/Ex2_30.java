package chapter2;
import java.util.Scanner;
public class Ex2_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer with five digits: ");
		int n = input.nextInt(), dm, m, c, d, u;
		dm = n / 10000; n -= dm * 10000;
		m = n / 1000; n -= m * 1000;
		c = n / 100; n -= c * 100;
		d = n / 10; n -= d * 10;
		u = n / 1;
		System.out.printf("\n%d   %d   %d   %d   %d\n", dm, m, c, d, u);
		input.close();
	}
}
