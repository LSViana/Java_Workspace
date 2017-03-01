package chapter5;
public class Ex5_9 {
	public static void main(String[] args) {
		System.out.println("See the comments.");
	}
}

/* 5.9
 * 
 * 	a)	Além de ser um laço infinito, mas não é necessariamente um erro, ainda contém erros de sintaxe no cabeçalho do laço 'for'
 * 		for (i = 100; i >= 1; i++)
 * 			System.out.println(i);
 * 
 * 	b)	Está faltando a instrução 'break' após o primeiro rótulo 'case' (case 0), pois caso ele seja executado, sem 'break', as instruções no rótulo 'case 1' também serão executadas.
 * 		switch (value % 2) {
 * 			case 0: System.out.println("Even integer"); break;
 * 			case 1: System.out.println("Odd integer");
 * 		}
 * 
 *	c) 	O código deve fazer o contador decrescer, mas o contrário está ocorrendo, ele está sendo incrementado, gerando uma saída indesejada e um laço infinito.
 *		for (i = 19; i >= 1; i -= 2)
 *			System.out.println(i);
 *
 *	d)	O código não exibirá o último valor necessário, que no caso é 100, para isso, o operador relacional '<' na condição da instrução 'do-While' deve ser trocado por '<='
 *		(int) counter = 2;
 *		do {
 *			System.out.println(counter);
 *			counter += 2;
 *		} while(counter <= 100);	
 * 
 */
