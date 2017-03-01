package chapter4;
import java.util.Scanner;
public class Ex4_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int aux = -1, accNumber = 0, balance = 0, charged = 0, credit = 0, limit = 0;
		System.out.println("\tAUXILIAR DE CÁLCULO DE LIMITE DE CRÉDITO [Digite um valor inválido para sair]\n");
		for (; aux != 0;) {
			System.out.print("Digite o número da conta:\t\t\t");
			accNumber = input.nextInt();
			if (accNumber > 0) {
				System.out.print("Digite o saldo da conta:\t\t\t");
				balance = input.nextInt();
				System.out.print("Digite o total de itens cobrados da conta:\t");
				charged = input.nextInt();
				System.out.print("Digite o total de créditos aplicados da conta:\t");
				credit = input.nextInt();
				System.out.print("Digite o limite de crédito autorizado:\t\t");
				limit = input.nextInt();
			} else {
				aux = 0;
				accNumber = 0;
				System.out.println("\nO aplicativo será encerrado.\n");
			}
			if (aux != 0) {
				System.out.printf("\n\tNúmero da conta: \t\t%d\n\tSaldo da conta:\t\t\t%d\n\tItens cobrados da conta:\t%d\n\tCréditos aplicados da conta:\t%d\n\tLimite de crédito da conta:\t%d\n\tNovo saldo:\t\t\t%d\n\tEstado da conta:\t\t", accNumber, balance, charged, credit, limit, (balance + credit) - charged);
				if (balance + credit - charged  > limit) 
					System.out.print("Limite de crédito excedido.\n[Fim de cálculo]\n\n");
				else
					System.out.print("Limite de crédito respeitado.\n[Fim de cálculo]\n\n");
			}	
		}
		input.close();
	}
}
