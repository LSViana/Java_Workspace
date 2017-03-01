package chapter2;
import java.util.Scanner;
public class Ex2_24_Hardcore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte f = input.nextByte();
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, v;
		for(byte c = 0; c < f; c++) {
			System.out.println("Enter an integer:");
			v = input.nextInt();
			if (v > max) max = v;
			if (v < min) min = v;
		}
		System.out.printf("\nThe biggest: %d\nThe smallest: %d\n", max, min);
		input.close();
	}
}
