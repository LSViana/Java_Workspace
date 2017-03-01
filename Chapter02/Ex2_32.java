package chapter2;
import java.util.Scanner;
public class Ex2_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int p = 0, z = 0, n = 0;
		System.out.print("Enter an integer: ");
		int v1 = input.nextInt();
		if (v1 > 0) p++;
		else if (v1 == 0) z++;
		else if (v1 < 0) n++;
		System.out.print("\nEnter an integer: ");
		v1 = input.nextInt();
		if (v1 > 0) p++;
		else if (v1 == 0) z++;
		else if (v1 < 0) n++;
		System.out.print("\nEnter an integer: ");
		v1 = input.nextInt();
		if (v1 > 0) p++;
		else if (v1 == 0) z++;
		else if (v1 < 0) n++;
		System.out.print("\nEnter an integer: ");
		v1 = input.nextInt();
		if (v1 > 0) p++;
		else if (v1 == 0) z++;
		else if (v1 < 0) n++;
		v1 = 0;
		System.out.print("Enter an integer: ");
		v1 = input.nextInt();
		if (v1 > 0) p++;
		else if (v1 == 0) z++;
		else if (v1 < 0) n++;
		System.out.printf("\nThe positive numbers: %d\nThe zero numbers: %d\nThe negative numbers: %d\n", p, z, n);
		input.close();
	}
}

//TÓPICOS DO 'Fazendo a Diferença' FORAM POSTOS EM SEGUNDO PLANO, THE KNOWLEDGE IS THE TOP.