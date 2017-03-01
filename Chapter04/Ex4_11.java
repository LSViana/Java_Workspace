package chapter4;
public class Ex4_11 {
	public static void main(String[] args) {
		System.out.println("See the comments.");
	}
}

/* 	4.11
 * 
 * 	A divisão é feita, mas, caso haja, a parte fracionária do número é truncada, ou seja, cortada, por exemplo, quando divimos 7 por 2 (sendo dois inteiros), o resultado retornado é 3, e não 3,5. Um programador pode evitar este tipo de problema utilizando um operador de coerção unário, que agirá sobre um único operando, por exemplo, ao dividir dois inteiros, poderemos colocar um operador de coerção para ponto flutuante nele e assim o outro também será copiado para uma cópia temporária de ponto flutuante para fazer a conta e retornar esse resultado, ao fim da operação todas as cópias são apagadas e os valores (em inteiro) são conservados.
 * 
 */