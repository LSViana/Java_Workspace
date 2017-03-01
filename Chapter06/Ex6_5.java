package chapter6;
public class Ex6_5 {
	public static void main(String[] args) {
		System.out.println("See the comments.");
	}
}
/*	6.5
 * 
 * 	a)	Os métodos devem ser postos cada um em seu bloco, e não aninhados em outros métodos mais exteriores, a correção seria a seguinte:
 * 		
 * 		void g() {
 * 			System.out.println("Inside method g");
 * 		}
 *		void h() {
 * 			System.out.println("Inside method h");
 * 		}
 * 
 * 	b)	Falta uma instrução para retornar o valor da soma, que pode ser adicionada através da instrução:
 * 
 * 		return result;
 * 
 * 	c)	O ponto e vírgula após a lista de parâmetros está incorreto e há uma declaração de uma variável 'a' no cabeçalho do método e outra com o mesmo nome dentro do método, ou seja, há uma sobreposição inválida de escopos, o que geraria um erro de compilação, para corrigir:
 * 
 * 		1.	void f(float a) {
 * 				System.out.println(a);
 * 			}
 * 		2.	void f(float a) {
 *				float a2;
 *				System.out.println(a);
 * 				System.out.println(a2);
 * 			}
 * 
 * 	d)	O método tem uma instrução 'return' mesmo tendo em seu cabeçalho o tipo de retorno 'void', ou seja, nulo, isso gera um erro de compilação, para corrigir:
 * 
 * 		1.	void product() {
 * 				int a = 6, b = 5, c = 4, result;
 * 				result = a * b * c;
 * 				System.out.printf("Result is %d\n", result);
 * 			}
 * 		2.	int product() {
 * 				int a = 6, b = 5, c = 4, result;
 * 				result = a * b * c;
 * 				System.out.printf("Result is %d\n", result);
 * 				return result;
 * 			}
 * 
 */
