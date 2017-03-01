package chapter5;
public class Ex5_21 {
	public static void main(String[] args) {
		System.out.println("\tPITAGORAS' TRIPLES\n");
		int side1, side2, hypotenuse;
		for(side1 = 1; side1 <= 500; side1++)
			for(side2 = 1; side2 <= 500; side2++)
				for(hypotenuse = 1; hypotenuse <= 500; hypotenuse++)
					if(side1 * side1 + side2 * side2 == hypotenuse * hypotenuse)
						System.out.printf("Pitagoras' Triple found with: S1 [%3d] - S2 [%3d] - HYP [%3d]\n", side1, side2, hypotenuse);
	}
}
