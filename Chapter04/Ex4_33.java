package chapter4;
public class Ex4_33 {
	public static void main(String[] args) {
		int number = 0;
		for (; number != 1; number *= 2) {
			if (number == 0)
				number += 2;
			System.out.println(number); 
		}
		// OR
		/*int*/ number = 2;
				for (; number != 0; number *= 2)
					System.out.println(number);
	}
}

/* O QUE ACONTECE QUANDO SE EXECUTA ESSE PROGRAMA?
 * 
 * – Os recursos se esgotam e a variável, quando atinge seu valor máximo, passa a ter seu valor mínimo, como numa espécie de roda, fazendo com que, em algum momento, os valores se repitam
 * 
 * O retorno não foi exatamente como o esperado sem um 'If', que havia sido posto para possibilitar a exibição do zero, afinal ele também é um múltiplo, mas a parte que diz que em um momento o número se tornaria negativo se mostrou verdadeira, e, por algum motivo, ele passou a ser zero e deste valor não mais saiu.
 *  
 */
