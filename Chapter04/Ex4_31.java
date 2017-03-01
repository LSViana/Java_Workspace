package chapter4;
import java.util.Scanner;
public class Ex4_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\t\nCONVERSÃO DE NÚMEROS BINÁRIOS PARA NÚMEROS DECIMAIS [Digite 0 para sair]\n");
		int decimal = 0, binary = 1, aux1 = 9, size = 1;
		while (binary != 0) {
			System.out.print("Digite um valor para conversão: "); binary = input.nextInt();
			if (binary > 0) {
				while (aux1 / binary == 0) {
					aux1 *= 10; aux1 += 9; size++;
				} int[] binaryVector = new int[size]; 
				int aux2 = 10;
				for (byte count1 = 0; count1 < size; count1++) {
					binaryVector[count1] = binary % aux2; 
					for (byte count2 = 0; count2 < count1; count2++) {
						binaryVector[count1] -= binaryVector[count2];
					}
					aux2 *= 10;
				} aux2 = 1;
				for (byte count1 = 0; count1 < size; count1++) {
					if (binaryVector[count1] > 0)
						binaryVector[count1] /= (aux2);
					aux2 *= 10;
				}
				aux2 = 2;
				for (int c : binaryVector) {
					decimal += c * (aux2 / 2); aux2 *= 2;
				} System.out.println("O valor digitado é igual a: " + decimal + "."); decimal = 0;
			} else
				System.out.println("\nO valor digitado não é válido.");
			aux1 = 9; size = 1;
		}
		input.close();
	}
}