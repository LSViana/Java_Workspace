package chapter4;
import java.util.Scanner;
public class Ex4_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tIMPRESSÃO DE TABULEIROS DE TAMANHO DINÂMICO [Digite zero para sair]\n");
		int size = 1, aux1, aux2;
		while (size != 0) {
			System.out.print("Digite o tamanho desejado para o tabuleiro: "); size = input.nextInt();
			if (size > 0) {
				for (aux1 = 0; aux1 < size; aux1++) {
					if (aux1 % 2 == 0)
						System.out.print(" ");
					for(aux2 = 0; aux2 < size; aux2++) {
						System.out.print("*");
						System.out.print(" ");
					}
					System.out.println();
				}
			} else if (size < 0)
				System.out.print("Valor inválido para o tamanho do tabuleiro.\n\n");
			else
				System.out.print("Valor inválido, o programa está sendo encerrado.");
		}
		input.close();
	}
}
