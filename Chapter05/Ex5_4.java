package chapter5;
public class Ex5_4 {
	public static void main(String[] args) {
		System.out.println("See the comments.");
	}
}

/* 5.4
 
	a)	Remova o ponto-e-vírgula depois da condição da instrução 'while' e remova a última chave ou adicione uma no lugar do ponto-e-vírgula removido
		i = 1;
		while (i <= 10)
			i++;
	
	b)	Utilizar um número de ponto flutuante pode gerar erros em tempo de execução, pois eles são calculados com uma aproximação, por este motivo, utilize números inteiros e realize um cálculo eficaz
		for (k = 1; k != 10; k++)
			System.out.println(k);
			
	c)	Há de ser feita a remoção da instrução 'break' no rótulo 'default' e ser posta uma no rótulo 'case 1', pois caso a variável 'n' seja 1, será executado o código do rótulo 'case 2' por consequência
		switch (n) {
			case 1: System.out.println("The number is 1"); break;
			case 2: System.out.println("The number is 2"); break;
			default: System.out.println("The number is not 1 or 2");
		}
		
	d)	O laço deve ser repetido até 'n' atingir 10, para que o valor 10 seja mostrado na tela, ou seja, o operador relacional deve ser trocado por 'menor ou igual'.
		(int) n = 1;
		while (n <= 10)
			System.out.println(n++);
  
 */
