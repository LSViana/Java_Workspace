package chapter4;
public class Ex4_34 {
	public static void main(String[] args) {
		// Tests
		int x = 1, y = 2, z = x + y;
		System.out.println(x + y + 1);
		System.out.println(z + 1);
	}
}

/* 4.34
 * 
 * 	O operador de incremento, seja ele pré ou posposto, DEVE possuir somente UM operando, e este não pode ser uma equação, deve ser um operando individual, ou seja, para adicionar um à soma de X e Y, poderíamos proceder das seguintes maneiras:
 *  	I.	System.out.println(x + y + 1);
 *  	II.	int z = x + y;
 *  		System.out.println(z + 1); // System.out.println(++z);
 * 
 */
