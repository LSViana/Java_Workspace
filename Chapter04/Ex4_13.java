package chapter4;
public class Ex4_13 {
	public static void main(String[] args) {
		System.out.println("See the comments.");
	}
}

/*	4.13
 * 
 *	Para calcular a soma dos 100 primeiros inteiros positivos seria adequado o uso de REPETIÇÃO CONTROLADA POR CONTADOR,
 *	em compensação, para calcular a soma de uma quantidade arbitrária de números, seria adequado o uso de REPETIÇÃO CONTROLADA POR SENTINELA/FICTÍCIO/FLAG/SINAL
 *
 *	Para realizar o primeiro processo, basta iniciar um contador, NESTE CASO, PARA EXEMPLO, EM 1, e incrementá-lo a cada iteração do loop da repetição, até que chegue a 100 e execute o corpo da instrução de repetição e depois vire 101 e torne-se falsa, fazendo com que o laço termine e a soma seja calculada.
 *	Para realizar o segundo processo, considerando que só receberíamos NÚMEROS INTEIROS POSITIVOS, poderíamos usar -1 (OU QUALQUER OUTRO VALOR NEGATIVO) como valor de flag, ou seja, as variáveis SUM e NUMBER são definidas como 0, o laço começa a executar com a condição de que NUMBER seja diferente de -1 (OU ENTÃO POSITIVO), e ele lerá o arquivo da entrada padrão e o somará à variável SUM e assim armazenará o resultado até que o usuário deseje acabar a soma e digitar -1, quando o resultado será exbibido.
 * 
 */
