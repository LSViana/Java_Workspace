package playground;
public class PassArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println("Effects of passing reference to entire array:\n" +
		"The values of the original array are:");
		// it returns the original array's values
		for(int value : array)
			System.out.printf(" %d", value);
		modifyArray(array); // it passes a [REFERENCE] TO ARRAY
		System.out.println("\n\nThe values of the modified array are: ");
		for(int value : array)
			System.out.printf(" %d", value);
		System.out.printf("\n\nEffects of passing array element value:\narray[3] before modifyElement: %d\n", array[3]);
		modifyElement(array[3]);
		System.out.printf("array[3] after modifyElement: %d\n", array[3]);
	}
	// it multiplies each array element by 2
	public static void modifyArray(int[] arrayRef) {
		for(int counter = 0; counter < arrayRef.length; counter++)
			arrayRef[counter] *= 2;
	}
	// it multiplies the argument by 2
	public static void modifyElement(int element) {
		element *= 2;
		System.out.printf("Value of element in modifyElement method: %d\n", element);
	}
}
