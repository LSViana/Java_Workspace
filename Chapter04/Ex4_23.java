package chapter4;
import java.util.Scanner;
public class Ex4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("CALCULADORA DE MAIOR E SEGUNDO MAIOR NÚMERO\n");
		System.out.print("Digite o valor número 1: ");
		int number = input.nextInt(), larg = number, secondLarg = number;
		for (byte count = 1; count < 10; count++) {
			System.out.printf("Digite o valor número %d: ", count + 1);
			number = input.nextInt();
			if (number > secondLarg) {
				if (number > larg)
					larg = number;
				else
					secondLarg = number;
			}
		}
		System.out.printf("\nThe largest number found is: %d\nThe second largest number found is: %d", larg, secondLarg);
		input.close();
	}
}
