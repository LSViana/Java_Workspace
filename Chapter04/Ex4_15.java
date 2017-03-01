package chapter4;
public class Ex4_15 {
	public static void main(String[] args) {
		System.out.println("See the comments.");
	}
}

/*	4.15
 * 
 *	a)	if (age >= 65) // Remoção do 'ponto-e-vírgula' no final da linha.
 *			System.out.println("Age is greater than or equal to 65"); // Kept
 *		else
 *			System.out.println("Age is less than 65"); // Correction of the position of the quotation marks
 *
 *	b)	int x = 1, total = 0; // Inicialização da variável TOTAL para evitar erro de compilação
 *		while (x <= 10)
 *		{
 *			total +=x;
 *			++x;
 *		} // All was kept
 *
 *	c)	while (x <= 100) { // Inserção de chaves para compôr o corpo da instrução.
 *			total += x; // Kept, considering the PRE-initializing in TOTAL variable
 *			++d
 *
 *	d)	while (y < 0) // Mudança da condição para evitar laços infinitos
 *		{
 *			System.out.println(y);
 *			++y;
 *		} // Organização da chave de saída.
 * 
 */
