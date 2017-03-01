package chapter5;
public class Ex5_28 {
	public static void main(String[] args) {
		System.out.println("See the comments.");
	}
}

/* 5.28
 
 	Para a remoção da instrução 'break' uma maneira eficiente seria fazer um teste a cada iteração, colocando como condição a instrução desejada para que o programa seja parado, quando ela for verdadeira, altera-se o contador ou o flag (sentinela) para a finalização do laço de repetição, seja ele 'do-While', 'while' ou 'for'.
  	O mesmo conceito pode ser aplicado para a remoção da instrução 'continue', porém ao invés de se alterar o contador ou flag (sentinela), apenas muda o controle do programa para evitar a execução normal.
 
  	Um exemplo simples da remoção da instrução 'continue':
	// WITH CONTINUE
	int i;
	for(i = 1; i <= 10; i++) {
		if(i == 5)
			continue;
		System.out.print(i + " ");
	} System.out.print("\nThe loop has skipped the number 5");
	
	// WITHOUT CONTINUE
	int i;
	for(i = 1; i <= 10; i++) {
		if(i != 5)
			System.out.print(i + " ");
	} System.out.print("\nThe loop has skipped the number 5");
 
 */
