package chapter5;
import java.util.Scanner;
public class Ex5_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("\tCALCULANDO O MENOR VALOR [O primeiro valor deve especificar quantos serão inseridos]\n");
		int i = input.nextInt(), lower = input.nextInt();
		for(int cont = i; cont > 1; cont--) { // It runs until 1 because it shall running (i-1) times
			i = input.nextInt();
			if (i < lower)
				lower = i;
		}
		System.out.println("O menor valor localizado foi: " + lower);
		input.close();
	}
}
