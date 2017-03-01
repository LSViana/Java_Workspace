package chapter4;
import java.util.Scanner;
public class Ex4_36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tTESTANDO A EXISTÊNCIA DE UM TRIÂNGULO DIREITO [Digite um valor menor de zero para sair]\n");
		boolean verif;
		int a = 1, b = 1, c = 1;
		while (a > 0 && b > 0 && c > 0) {
			verif = true;
			System.out.print("Digite o valor da medida do lado 'a': "); a = input.nextInt();
			if (a > 0) {
				System.out.print("Digite o valor da medida do lado 'b': "); b = input.nextInt();
				if (b > 0) {
					System.out.print("Digite o valor da medida do lado 'c': "); c = input.nextInt();
					if (c > 0) {
						if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
							System.out.println("O triângulo é direito.\n");
						else
							System.out.println("O triângulo não é direito.\n");
						verif = false;
					}
				} 
			}
			if (verif) {
				System.out.println("\nO programa será encerrado.");
				a = 0;
			}
		}
		input.close();
	}
}
