package chapter6;
public class Ex6_34 {
	public static void main(String[] args) {
		System.out.println("\tTranslating binary, octal and hexadecimal values\n");
		System.out.printf("%-10s\t%-10s\t%-10s\t%-10s\n", "       DEC", "       BIN", "       OCT", "       HEX");
		for(int value = 1; value <= 256; value++) {
			System.out.printf("|   %-8s\t|   %-8s\t|   %-8s\t|   %-8s\t\n", value, decToBin(value), decToOct(value), decToHex(value));
		}
	}
	public static String decToBin(int decNumber) {
		String value = "";
		while(decNumber / 2 != 0) {
			value = (decNumber % 2) + value; decNumber /= 2;
		} value = decNumber + value;
		return value;
	}
	public static String decToOct(int decNumber) {
		String value = "";
		while(decNumber / 8 != 0) {
			value = (decNumber % 8) + value; decNumber /= 8;
		} value = decNumber + value;
		return value;
	}
	public static String decToHex(int decNumber) {
		String value = "";
		while(decNumber / 16 != 0) {
			if(decNumber % 16 < 10)
				value = (decNumber % 16) + value;
			else {
				switch(decNumber % 16) {
				case 10: value = "A" + value; break;
				case 11: value = "B" + value; break;
				case 12: value = "C" + value; break;
				case 13: value = "D" + value; break;
				case 14: value = "E" + value; break;
				case 15: value = "F" + value; break;
				}
			} decNumber /= 16;
		} if(decNumber < 10) value = (decNumber % 16) + value;
		else {
			switch(decNumber % 16) {
			case 10: value = "A" + value; break;
			case 11: value = "B" + value; break;
			case 12: value = "C" + value; break;
			case 13: value = "D" + value; break;
			case 14: value = "E" + value; break;
			case 15: value = "F" + value; break;
			}
		}
		return value;
	}
}
