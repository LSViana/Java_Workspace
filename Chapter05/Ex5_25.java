package chapter5;
import java.util.Scanner;
public class Ex5_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tLOZENGES PRINTER PROGRAM\n");
		System.out.print("Enter the size of the lozenge [it must be a odd integer, or will be converted in one]: "); int size = input.nextInt();
		System.out.println();
		if (size % 2 == 0)
			size--;
		for(int i = size; i >= -size; i -= 2) {
			if (i != -1) { 
			for(int blank = (Math.abs(i) - 1) / 2; blank > 0; blank--)
				System.out.print(' ');
			for(int ast = size - Math.abs(i) + 1; ast > 0; ast--)
				System.out.print('*');
			for(int blank = (Math.abs(i) - 1) / 2; blank > 0; blank--)
				System.out.print(' ');
			System.out.println();
			}
		}
		input.close();
	}
}
