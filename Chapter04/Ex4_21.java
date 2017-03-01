package chapter4;
import java.util.Scanner;
public class Ex4_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0, number, largest;
		System.out.print("\tCALCULADORA DE MAIOR NÚMERO\n\n");
			System.out.printf("Digite o valor %d: ", ++counter);
			number = input.nextInt(); largest = number;
		for (; counter < 10; counter++) {
			System.out.printf("Digite o valor %d: ", counter + 1);
			number = input.nextInt();
			if (number > largest)
				largest = number;
		}
		System.out.printf("\nO maior número encontrado foi: %d", largest);
		input.close();
	}
}
