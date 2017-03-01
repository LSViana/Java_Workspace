package chapter4;
import java.util.Scanner;
public class Ex4_38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("IMPONDO PRIVACIDADE COM CRIPTOGRAFIA [Digite um valor menor ou igual a zero para sair]\n");
		int aux = 1;
		while (aux != 0) {
			System.out.print("\nDigite o número a ser criptografado: "); aux = input.nextInt();
			if (aux > 0) {
				System.out.printf("O item %d criptografado é: %d.\n", aux, encrypt(aux));
				System.out.printf("O item %d decriptografado é: %d.\n", encrypt(aux), decrypt(encrypt(aux)));
				System.out.printf("O item %d decriptografado é: %d.\n", aux, decrypt(aux));
			} else
				System.out.printf("\nO programa está sendo encerrado.");
		}
		input.close();
	}
	public static int encrypt(int number) {
		if (number > 999 && number < 10000) {
		int size = 4, aux1 = 10;
		int[] arrayNumber = new int[size];
		for (byte count1 = 0; count1 < size; count1++) {
			arrayNumber[count1] = number % aux1;
			aux1 *= 10;
		} aux1 /= 100;
		for (int count2 = size - 1; count2 > 0; count2--) {
			arrayNumber[count2] -= arrayNumber[count2 - 1];
			arrayNumber[count2] /= aux1;
			aux1 /= 10;
		} for (int count3 = 0; count3 < size; count3++) {
			arrayNumber[count3] += 7; arrayNumber[count3] %= 10;
		} number = 0;
		for (int c : arrayNumber) {
			number += c * aux1; aux1 *= 10;
		}
		return number;
		} else
			return 0;
	}
	public static int decrypt(int number) {
		if (number > 0) {
			int size = 4, aux1 = 10;
			int[] arrayNumber = new int[size];
			for (byte count1 = 0; count1 < size; count1++) {
				arrayNumber[count1] = number % aux1;
				aux1 *= 10;
			} aux1 /= 100;
			for (int count2 = size - 1; count2 > 0; count2--) {
				arrayNumber[count2] -= arrayNumber[count2 - 1];
				arrayNumber[count2] /= aux1;
				aux1 /= 10;
			} for (int count3 = 0; count3 < size; count3++) {
				if (arrayNumber[count3] < 7)
					arrayNumber[count3] += 10;
				arrayNumber[count3] -= 7;
			} number = 0;
			for (int c : arrayNumber) {
				number += c * aux1; aux1 *= 10;
			} return number;
		} else
			return 0;
	}
}
