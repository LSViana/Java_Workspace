package chapter5;
public class Ex5_13 {
	public static void main(String[] args) {
		System.out.println("\tCALCULANDO OS FATORIAIS DE 1 A 20\n");
		for(int i = 1; i <= 20; i++) {
			long fat = 1;
			for(int controller = i; controller > 0; controller--)
				fat *= controller;
			System.out.printf("O fatorial de %2d é: %20d\n", i, fat);
		}
	}
}

// O cálculo do fatorial de 100 poderia ser extremamente dificultoso numa programação casual devido às limitações de tamanho das variáveis na memória, fazendo com que o resultado gerado fosse incorreto.