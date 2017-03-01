package chapter4;
public class Ex4_16 {
	public static void main(String[] args){
		int y, x = 1, total = 0;
		while (x <= 10) {
			y = x * x;
			System.out.println(y);
			total += y;
			++x;
		}
		System.out.printf("Total is %d\n", total);
	}
}

/*	4.16
 * 
 * 	A saída é a seguinte:
 * 1
 * 4
 * 9
 * 16
 * 25
 * 36
 * 49
 * 64
 * 81
 * 100
 * 21
 *
 *	Total is: %d (Some number)
 * 
 */
