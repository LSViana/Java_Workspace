package chapter4;
import java.util.Scanner;
public class Ex4_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tVERIFICAÇÃO DE PALÍNDROMOS [Digite zero para sair]\n");
		int number = 10000, unit, dec, hund, thous, decThous;
		while (number != 0) {
			System.out.print("Digite o valor a ser verificado: "); number = input.nextInt();
			if (number > 9999 && number < 100000) {
				unit = number % 10; dec = (number % 100 - unit) / 10; hund = (number % 1000 - (unit + dec)) / 100; thous = (number % 10000 - (unit + dec + hund)) / 1000; decThous = number / 10000;
				if (unit == decThous && dec == thous) {
					System.out.println("\nO valor digitado é um palíndromo.");
				} else
					System.out.println("\nO valor digitado não é um palíndromo.");
			} else {
				System.out.println("\nO valor digitado não foi válido.");
			}
		}
		input.close();
	}
}
