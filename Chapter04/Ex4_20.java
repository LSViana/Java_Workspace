package chapter4;
import java.util.Scanner;
public class Ex4_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\tCÁLCULO DE SALÁRIO BRUTO [Digite zero para sair]\n");
		int h = 1; double sb = 0.01, sal = 0;
		while (h > 0 && sb > 0) {
			System.out.print("Digite o número de horas trabalhadas:\t");
			h = input.nextInt();
			if (h > 0) {
				System.out.print("Digite o salário base do func.:\t\t");
				sb = input.nextDouble();
				if (sb <= 0)
					h = 0;
			} else 
				h = 0;
			if (h >= 40) {
				sal = sb * 40 + (1.5 * sb * (h - 40));
				System.out.printf("\n\tSalário bruto semanal: R$%.2f\n\n", sal);
			} else if (h > 0) {
				sal = sb * h;
				System.out.printf("\n\tSalário bruto semanal: R$%.2f\n\n", sal);
			}
		}
		System.out.print("\nAplicativo em processo de encerramento.");
		input.close();
	}
}
