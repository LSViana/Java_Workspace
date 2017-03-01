package chapter5;
public class Ex5_12 {
	public static void main(String[] args) {
		System.out.println("\tCALCULANDO O PRODUTO DOS NÚMEROS INTEIROS ÍMPARES DE 1 A 15\n");
		int product = 1;
		for(int i = 1; i <= 15; i += 2)
			product *= i;
		System.out.println("O resultado do produto dos números inteiros ímpares de 1 a 15 é: " + product);
	}
}
