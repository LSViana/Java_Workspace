package chapter4;
public class Ex4_12 {
	public static void main(String[] args) {
		System.out.println("See the comments.");
	}
}

/*	4.12
 * 
 * 	As instruções podem ser combinadas, basicamente, de duas maneiras, são elas:
 * 		» Empilhamento: as instruções são postas na saída final das outras, ou seja, se há uma instrução IF-ELSE, colocaríamos a próxima instrução fora dos dois corpos (IF e ELSE), ou seja, a instrução posta só executará após o fim do ELSE, deste IF e ELSE
 * 
 * 		» Aninhamento: as instruções são postas umas dentro do bloco de outras, ou seja, no exemplo acima, que temos um IF-ELSE, nós colocaríamos uma outra instrução de controle, por exemplo um IF simples, dentro do corpo do IF (que faz parte do IF-ELSE) e uma instrução de repetição WHILE dentro do corpo do ELSE (que faz parte do IF-ELSE), sendo assim, nós aninhamos as instruções WHILE e IF (simples) dentro da instrução de seleção composta (IF-ELSE).
 * 
 */
