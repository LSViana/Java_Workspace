package playground;
public class ch7_7Test {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Original array");
		for(int x : array)
			System.out.print(x + " ");
		System.out.println();
		System.out.println("Possibly modificated array");
		modifyArray(array);
		for(int x : array)
			System.out.print(x + " ");
		modifyElement(array[0]);
		System.out.println();
		System.out.println("First element possibly incremented");
		for(int x : array)
			System.out.print(x + " ");
		System.out.println();
		System.out.print("Test: \n" + modifyElement(array[0]) + " ");
		for(int x = 1; x < array.length; x++)
			System.out.print(array[x] + " ");
	}
	public static void modifyArray(int[] values) {
		for(int i = 0; i < values.length; i++)
			values[i]++;
	}
	public static int modifyElement(int value) {
		return ++value;
	}
}
