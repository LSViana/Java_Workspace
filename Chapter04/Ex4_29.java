package chapter4;
import java.util.Scanner;
public class Ex4_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tEXIBIÇÃO DE QUADRADOS DE TAMANHO DINÂMICO\n");
		System.out.print("Insira o tamanho desejado para a aresta do quadrado: ");
		int size = input.nextInt();
		System.out.println();
		for(byte aux1 = 0; aux1 < size; aux1++) {
			for(byte aux2 = 0; aux2 < size; aux2++)
				System.out.print("* "); // The space is making a REAL square, in another case the square will be deformed
			System.out.println();
		}
		input.close();
	}
}
