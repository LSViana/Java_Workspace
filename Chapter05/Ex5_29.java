package chapter5;
public class Ex5_29 {
	public static void main(String[] args) {
		for(int i = 1; i <= 12; i++) {
			System.out.print("On the ");
			switch(i) {
				case 1: System.out.print("First "); break; 
				case 2: System.out.print("Second "); break;
				case 3: System.out.print("Third "); break;
				case 4: System.out.print("Fourth "); break;
				case 5: System.out.print("Fifth "); break;
				case 6: System.out.print("Sixth "); break;
				case 7: System.out.print("Seventh "); break;
				case 8: System.out.print("Eighth "); break;
				case 9: System.out.print("Ninth "); break;
				case 10: System.out.print("Tenth "); break;
				case 11: System.out.print("Eleventh "); break;
				case 12: System.out.print("Twelfth "); break;
			} System.out.print("day of Christmas, my true love sent to me\n");
			if(i == 1) {
				System.out.println("A partridge in a pear-tree");
			} else if(i >= 1) {
				if(i == 2)
					System.out.println("Two turtle doves");
				if(i >= 12)
					System.out.println("Twelve lords a leaping.");
				if(i >= 11)
					System.out.println("Eleven ladies dancing,");
				if(i >= 10)
					System.out.println("Ten pipers piping,");
				if(i >= 9)
					System.out.println("Nine drummers drumming,");
				if(i >= 8)
					System.out.println("Eight maids a milking,");
				if(i >= 7)
					System.out.println("Seven swans as swimming,");
				if(i >= 6)
					System.out.println("Six geese a laying,");
				if(i >= 5)
					System.out.println("Five golden rings,");
				if(i >= 4)
					System.out.println("Four colly birds,");
				if(i >= 3)
					System.out.println("Three french hens,");
				if(i > 2)
					System.out.println("Two turtle doves,");
				System.out.println("And a partridge in a pear-tree");
			}			
			System.out.println();
		}
	}
}
