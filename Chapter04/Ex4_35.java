package chapter4;
import java.util.Scanner;
public class Ex4_35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tTESTANDO A EXISTÊNCIA DE UM TRIÂNGULO QUALQUER [Digite um valor menor de zero para sair]\n");
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
						if (a < b + c && Math.abs(b - c) < a) {
							if (b < a + c && Math.abs(a - c) < b) {
								if (c < a + b && Math.abs(a - b) < c) {
										System.out.println("O triângulo é válido.\n");
										verif = false;
								} else
									verif = true;
							} else
								verif = true;
						} else
							verif = true;
						if (verif)
							System.out.println("O triângulo não é válido.\n");
						verif = false;
					}
				}
			} if (verif) {
				System.out.println("O aplicativo será encerrado.");
				a = 0;
			}
		}
		input.close();
	}
}
