package chapter4;
public class Ex4_22 {
	public static void main(String[] args) {
		int control = 5;
		System.out.print("N\t10*N\t100*N\t1000*N\n");
		for(int aux = 1; aux <= control; aux++) {
			System.out.printf("%d\t%d\t%d\t%d\n", aux, aux * 10, aux * 100, aux * 1000);
		}
	}
}
